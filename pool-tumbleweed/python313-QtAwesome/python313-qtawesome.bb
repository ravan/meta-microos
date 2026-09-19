SUMMARY = "FontAwesome icons in PyQt and PySide applications"
DESCRIPTION = "QtAwesome enables iconic fonts such as Font Awesome and \
Elusive Icons in PyQt and PySide applications. \
 \
It is a port to Python - PyQt / PySide of the QtAwesome C++ \
library by Rick Blommers."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python313-QtAwesome-1.4.2-1.2.noarch.rpm"
RPM_HASH = "abce0a5a5693ab25cf678a5573ec931481274ee6596a7a90545d25df6ec48978f38a50ec402894520ee14c66b7f746b7a539f15f44fa50cf135d4e9fb085d00e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-QtAwesome \
python3-qtawesome \
python3.13dist-qtawesome \
python313-QtAwesome \
python313-qtawesome \
python3dist-qtawesome"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-QtPy \
update-alternatives"

inherit rpm
