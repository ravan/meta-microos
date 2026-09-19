SUMMARY = "Python library to manipulate ESC/POS Printers"
DESCRIPTION = "Library which lets the user have access to all those printers handled \
by ESC/POS commands, as defined by Epson, from a Python application. \
 \
The library tries to implement the functions provided by the \
ESC/POS-command-set and supports sending text, images, \
barcodes and qr-codes to the printer."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "python314-python-escpos-3.1-1.1.noarch.rpm"
RPM_HASH = "7fd2a7ab27da20d5510a9243b5b4b004d8b1f3a91a042599b215bf9d7808d3bac93be4760989e2dc91ff742e7f563888135a00f46844c127277f26f619e4025e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-escpos \
python314-escpos \
python314-python-escpos \
python3dist-python-escpos"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
alts \
python-abi \
python314-Pillow \
python314-appdirs \
python314-argcomplete \
python314-importlib-resources \
python314-pyaml \
python314-pycups \
python314-pyserial \
python314-python-barcode \
python314-pyusb \
python314-qrcode \
python314-setuptools"

inherit rpm
