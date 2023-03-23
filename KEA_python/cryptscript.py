from cryptography.fernet import Fernet
key = Fernet.generate_key()
cipher_suite = Fernet(key)
cipher_text = cipher_suite.encrypt(b'We are the CyberDefenders')
plain_text = cipher_suite.decrypt(cipher_text)
print("Cipher text is:", cipher_text)
print("The key is:", key)
print("Plain text is:", plain_text)