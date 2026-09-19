SUMMARY = "Python interface for kf6-kjobwidgets"
DESCRIPTION = "This package provides a python interface for kf6-kjobwidgets."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "python3-kf6-kjobwidgets-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "3ed3ba6f9f6494cea09e14fec6be677f055db24f9138fe80424f583175b405813cee89f76c0bd0d63838b3a76a4bfeb49633ee0e77ce635dc82f80fae5622cf7"

RPROVIDES:${PN} += "python3-kf6-kjobwidgets"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6JobWidgets.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libpyside6.abi3.so.6.11 \
libpython3.13.so.1.0 \
libshiboken6.abi3.so.6.11 \
libstdc++.so.6 \
python-abi"

inherit rpm
