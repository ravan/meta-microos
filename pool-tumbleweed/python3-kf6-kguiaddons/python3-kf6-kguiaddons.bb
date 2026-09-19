SUMMARY = "Python bindings for kf6-kguiaddons"
DESCRIPTION = "This package provides Python bindings for kf6-kguiaddons."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "python3-kf6-kguiaddons-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "c85cc2d5e5e379118ce15c62b4bc24442bade0445eaa0607309d98c2582d873031c15a724513ef0889b46107b74c6d6a7b491221f8124f583a5c52199e7abd23"

RPROVIDES:${PN} += "python3-kf6-kguiaddons"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6GuiAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libpyside6.abi3.so.6.11 \
libpython3.13.so.1.0 \
libshiboken6.abi3.so.6.11 \
libstdc++.so.6 \
python-abi"

inherit rpm
