SUMMARY = "Python library to manipulate ESC/POS Printers"
DESCRIPTION = "Library which lets the user have access to all those printers handled \
by ESC/POS commands, as defined by Epson, from a Python application. \
 \
The library tries to implement the functions provided by the \
ESC/POS-command-set and supports sending text, images, \
barcodes and qr-codes to the printer."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "python313-python-escpos-3.1-1.1.noarch.rpm"
RPM_HASH = "cee1e8aea6855f3d9642d6552a7a632da0f1eaa161859fd769ecd03185d4f009b05ee26d038152360c31ee87b14f7d3f6b57a29fa031671255338edb1c60d09e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-escpos \
python3-python-escpos \
python3.13dist-python-escpos \
python313-escpos \
python313-python-escpos \
python3dist-python-escpos"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
alts \
python-abi \
python313-Pillow \
python313-appdirs \
python313-argcomplete \
python313-importlib-resources \
python313-pyaml \
python313-pycups \
python313-pyserial \
python313-python-barcode \
python313-pyusb \
python313-qrcode \
python313-setuptools"

inherit rpm
