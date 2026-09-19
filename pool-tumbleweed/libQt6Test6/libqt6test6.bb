SUMMARY = "Qt 6 Test library"
DESCRIPTION = "Qt Test is a framework for unit testing Qt based applications and \
libraries. Qt Test provides functionality commonly found in unit \
testing frameworks as well as extensions for testing graphical user \
interfaces."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Test6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "a7c652bb16eb46b01bf94b8cb2618f0c41d8cea6c6cb597b6af813d8db3d980c84b0a5be62f38f8a4fd8a02471e104705c1fb93fef1d6a87a5dc5d40058e9ef8"

RPROVIDES:${PN} += "libQt6Test.so.6 \
libQt6Test6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
