SUMMARY = "Collection of General-purpose C++ Classes"
DESCRIPTION = "Cxxtools is a collection of general-purpose C++ classes. The library \
includes classes for serialization, unicode text, multi threading, \
networking, rpc, http client and server, xml, logging and many more."
LICENSE = "LGPL-2.1-only"

PV = "3.0"

RPM_NAME = "libcxxtools10-3.0-5.1.aarch64.rpm"
RPM_HASH = "579eb49bf7e936d49e1881ee3332517ec3d74a3c3528c308abf6b3e4d8f47eae94318278b08ae06fb4f1ccddf9bc284562fb5a06db4cfdd5854fb0dab3e89ff4"

RPROVIDES:${PN} += "libcxxtools.so.10 \
libcxxtools10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
