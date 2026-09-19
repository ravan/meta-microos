SUMMARY = "A library to compare files and strings"
DESCRIPTION = "A library to compare files and strings, used in Kompare and KDevelop."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libkomparediff2-6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "38061852f5000829dfd85ab8c0aa38969c32ab269a990a00f13a573c44f371ceb7e1b6e4d324f65f95502a7d0473fac9e5cbf9f802da5eab4f1e46e3a21409eb"

RPROVIDES:${PN} += "libkomparediff2-6 \
libkomparediff2.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
