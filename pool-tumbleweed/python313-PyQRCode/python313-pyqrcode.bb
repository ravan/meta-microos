SUMMARY = "Python 3 module to generate QR Codes"
DESCRIPTION = "The PyQRCode module is a QR code generator that is simple to use and written in pure python. \
The module can automates most of the building process for creating QR codes. \
Most codes can be created using only two lines of code."
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "python313-PyQRCode-1.3.6-7.5.noarch.rpm"
RPM_HASH = "3cc42474f13ff4af3a425e3a9a794ec2e252b910d3127093acd1a275772d33d23f5ea627885247bb7cee74976b4966f584b9adc05fc0e927c07699ac9283a846"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyQRCode \
python3-PyQRCodeNG \
python3-pyqrcodeng \
python3.13dist-pyqrcodeng \
python313-PyQRCode \
python313-PyQRCodeNG \
python313-pyqrcodeng \
python3dist-pyqrcodeng"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
