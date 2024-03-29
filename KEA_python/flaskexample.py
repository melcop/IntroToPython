import io
from flask import Response
import matplotlib.pyplot as plt
from matplotlib.backends.backend_agg import FigureCanvasAgg as FigureCanvas
from matplotlib.figure import Figure
from flask import Flask
import numpy as np
plt.rcParams["figure.figsize"] = [7.50, 3.50]
plt.rcParams["figure.autolayout"] = True
app = Flask(__name__)
@app.route('/print-plot')
def plot_png():
   fig = Figure()
   axis = fig.add_subplot(1, 1, 1)
   xs = np.random.rand(100)
   ys = np.random.rand(100)
   axis.plot(xs, ys)
   output = io.BytesIO()
   FigureCanvas(fig).print_png(output)
   return Response(output.getvalue(), mimetype='image/png')