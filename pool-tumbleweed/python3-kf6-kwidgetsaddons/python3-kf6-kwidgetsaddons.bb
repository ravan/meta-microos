SUMMARY = "Python interface for kf6-kwidgetsaddons"
DESCRIPTION = "This package provides a python interface for kf6-kwidgetsaddons."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "python3-kf6-kwidgetsaddons-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "fcfe3aa4d0d8b5627af050ed2c8565aec13fbcc3e718d33680d3b9fa5a01731206e6708698ac8322a050f8f8f4fcb3db6eb246e83601c2333ac2b746a9cebb91"

RPROVIDES:${PN} += "python3-kf6-kwidgetsaddons"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6WidgetsAddons.so.6 \
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
