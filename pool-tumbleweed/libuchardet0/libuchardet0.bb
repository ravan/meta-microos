SUMMARY = "Universal Charset Detection Library"
DESCRIPTION = "uchardet is a C language binding of the original C++ implementation of \
the universal charset detection library by Mozilla. \
 \
uchardet is an encoding detector library, which takes a sequence of \
bytes in an unknown character encoding without any additional \
information, and attempts to determine the encoding of the text. \
 \
This package contains the shared library."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "0.0.8"

RPM_NAME = "libuchardet0-0.0.8-2.5.aarch64.rpm"
RPM_HASH = "f8db6a6d6a41a4a7fbfcab65b6a37144620cb347ebb88c8c40efaa900fc75a2039b37779e3b42165d2659f8abe5dcb95f0a87a18110f9f6bcdcc4acf5966f490"

RPROVIDES:${PN} += "libuchardet.so.0 \
libuchardet0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
