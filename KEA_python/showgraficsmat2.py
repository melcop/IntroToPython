import matplotlib.pyplot as plt
import numpy as np

y1 = np.array([3, 8, 1, 5, 10, 5])
y2 = np.array([3, 4, 6, 11])
y3 = np.array([12, 16, 7, 9])
y4 = np.array([2, 5, 9, 1])
y5 = np.array([4, 2, 6, 2])

plt.plot(y1, 'o:g', ms = 20, mec = '#4CAF50', mfc = '#4CAF50', linestyle = 'solid')
plt.plot(y2, 'o:g', ms = 20, mec = '#4CAF50', mfc = '#4CAF50', linestyle = 'dotted')
plt.plot(y3, 'o:g', ms = 20, mec = '#4CAF50', mfc = '#4CFF50', linestyle = 'dashed')
plt.plot(y4, 'o:g', ms = 20, mec = '#4CAF50', mfc = '#4AAF20', linestyle = 'dashdot')
plt.plot(y5, 'o:g', ms = 20, mec = '#4CAF50', mfc = '#4FAF30', linestyle = 'none')
plt.show()