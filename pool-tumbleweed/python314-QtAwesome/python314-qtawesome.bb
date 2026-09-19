SUMMARY = "FontAwesome icons in PyQt and PySide applications"
DESCRIPTION = "QtAwesome enables iconic fonts such as Font Awesome and \
Elusive Icons in PyQt and PySide applications. \
 \
It is a port to Python - PyQt / PySide of the QtAwesome C++ \
library by Rick Blommers."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python314-QtAwesome-1.4.2-1.2.noarch.rpm"
RPM_HASH = "80515d8c8f84f6e0b7547d7d767807a295eaef74ad170132e6419a66c752296464af67c68e4b66e9ec8b0b6309e48e01b13b660f3999209c96be913b565f0afe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-qtawesome \
python314-QtAwesome \
python314-qtawesome \
python3dist-qtawesome"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-QtPy \
update-alternatives"

inherit rpm
