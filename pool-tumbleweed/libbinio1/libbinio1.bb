SUMMARY = "Binary I/O Stream Class Library"
DESCRIPTION = "The binary I/O stream class library presents a platform-independent way to \
access binary data streams in C++. It transparently converts between \
machine-internal binary data representation and can be used on arbitrary \
binary data sources."
LICENSE = "LGPL-2.1-only"

PV = "1.5"

RPM_NAME = "libbinio1-1.5-1.14.aarch64.rpm"
RPM_HASH = "676ac42af6fe03afbad41e45b648aeea24a7dadba0224aedc6e52c5de66eb3fa87597b10976a6318bbb1ba2ed04ad9878dd99d4dd4a13690081c18d07936cc11"

RPROVIDES:${PN} += "libbinio.so.1 \
libbinio1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
