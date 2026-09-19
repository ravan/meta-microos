SUMMARY = "Python interface for kf6-kxmlgui"
DESCRIPTION = "This package provides a python interface for kf6-kxmlgui."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "python3-kf6-kxmlgui-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "09f2b720179a24916fa58c5c13f9d5806e0ababaf12b9325796f331afb05a5b97e552c6fb406d96059b76705a27ce679eb107e7d5732307fe9d8f90f099c2f82"

RPROVIDES:${PN} += "python3-kf6-kxmlgui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libpyside6.abi3.so.6.11 \
libpython3.13.so.1.0 \
libshiboken6.abi3.so.6.11 \
libstdc++.so.6 \
python-abi"

inherit rpm
