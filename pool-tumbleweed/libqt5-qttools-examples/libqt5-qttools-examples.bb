SUMMARY = "Qt5 tools examples"
DESCRIPTION = "Examples for the libqt5-qttools module."
LICENSE = "BSD-3-Clause"

PV = "5.15.19+kde3"

RPM_NAME = "libqt5-qttools-examples-5.15.19+kde3-1.8.aarch64.rpm"
RPM_HASH = "4af2dfda52c321150c9b388ee8e4dd58fd218a1a8e6c81f408e45d1c16efde345fd3f048fb0870897d951504458c655d2d52c8f19fa0d1d5c03e860f36ce7079"

RPROVIDES:${PN} += "libqt5-qttools-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Help.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
