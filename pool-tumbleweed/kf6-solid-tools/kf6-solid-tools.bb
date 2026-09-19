SUMMARY = "KDE Desktop hardware abstraction"
DESCRIPTION = "Solid is a device integration framework. It provides a way of querying and \
interacting with hardware independently of the underlying operating system. \
CLI utilities."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-solid-tools-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "a793edefffcd12e42a65e9159cf8aa6113506d2f3b7657ebd4f4d859f44391a6935bff767aafad20b3370186737c566c3ac798f446e16d836d1dba340bda9b04"

RPROVIDES:${PN} += "kf6-solid-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Solid.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
