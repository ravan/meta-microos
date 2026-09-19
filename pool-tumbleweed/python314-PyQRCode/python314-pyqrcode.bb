SUMMARY = "Python 3 module to generate QR Codes"
DESCRIPTION = "The PyQRCode module is a QR code generator that is simple to use and written in pure python. \
The module can automates most of the building process for creating QR codes. \
Most codes can be created using only two lines of code."
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "python314-PyQRCode-1.3.6-7.5.noarch.rpm"
RPM_HASH = "53e399dcdccd2eedb0acc2471fe341c0a5262f2ffe0cbf068e845279712e97c37fe174516c70aa67866a8a79f9f3d4119d6e67537ca4df2482390ba34645aa39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyqrcodeng \
python314-PyQRCode \
python314-PyQRCodeNG \
python314-pyqrcodeng \
python3dist-pyqrcodeng"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
