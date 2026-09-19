SUMMARY = "KDE Desktop hardware abstraction"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system. \
CLI utilities."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "solid-tools-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "1b0710365e10ffadab4d41b2826c0fabff5f31d4efb6f743b77847b47b9dac710e21345302aa7221805b32116770ac0586f5f7d06d558ee77b347b9c96211ff5"

RPROVIDES:${PN} += "solid-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Solid.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
