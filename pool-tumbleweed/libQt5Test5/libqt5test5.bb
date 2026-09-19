SUMMARY = "Qt 5 Test Library"
DESCRIPTION = "Qt Test is a framework for unit testing Qt based applications and \
libraries. Qt Test provides functionality commonly found in unit \
testing frameworks as well as extensions for testing graphical user \
interfaces."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Test5-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "9b32bcd81d54a16596ea0dfcb287cee009dfdec7d06bf09c96a995954d9621d78f6825a2e08e676ff7bc148a0672bc16fc1e5400b686bb28797bd7288a6070a4"

RPROVIDES:${PN} += "libQt5Test.so.5 \
libQt5Test5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
