SUMMARY = "Python bindings for kf6-kcalendarcore"
DESCRIPTION = "This package provides Python bindings for kf6-kcalendarcore."
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "python3-kf6-kcalendarcore-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "9aaa071f62279967895683981596534008077b319313f5b06972fd570d1c7bd22cbe5bf6b2f49beb44eb3341d8cbfbb822048e840aea1b16602920cd596dc2e3"

RPROVIDES:${PN} += "python3-kf6-kcalendarcore"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libpyside6.abi3.so.6.11 \
libpython3.13.so.1.0 \
libshiboken6.abi3.so.6.11 \
libstdc++.so.6 \
python-abi"

inherit rpm
