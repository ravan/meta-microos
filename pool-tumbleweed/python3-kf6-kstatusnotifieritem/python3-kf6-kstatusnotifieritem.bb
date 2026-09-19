SUMMARY = "Python interface for kf6-kstatusnotifieritem"
DESCRIPTION = "This package provides a python interface for kf6-kstatusnotifieritem."
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "python3-kf6-kstatusnotifieritem-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "288eb4283a18aa27483e1f87d818b3bd5e7272cd288cf4668bc54bd6fb05ccb8e8a29b205f3205d08b79ecf434602f8e513d187420b70669621471a4ceb0157c"

RPROVIDES:${PN} += "python3-kf6-kstatusnotifieritem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6StatusNotifierItem.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libpyside6.abi3.so.6.11 \
libpython3.13.so.1.0 \
libshiboken6.abi3.so.6.11 \
libstdc++.so.6 \
python-abi"

inherit rpm
