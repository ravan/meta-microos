SUMMARY = "A C++ toolbox - testing library"
DESCRIPTION = "Cxxtools is a collection of general-purpose C++ classes. The library \
includes classes for serialization, unicode text, multi threading, \
networking, rpc, http client and server, xml, logging and many more."
LICENSE = "LGPL-2.1-only"

PV = "3.0"

RPM_NAME = "libcxxtools-unit10-3.0-5.1.aarch64.rpm"
RPM_HASH = "96ce7f0a19639f0b969857bf82fd773838129b3dcdf422dc3e79413c1201ec24c820a090e6235fcf466ab78606ac2f1a48fdea28ef091010f85951c5ec05d51b"

RPROVIDES:${PN} += "libcxxtools-unit.so.10 \
libcxxtools-unit10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
