SUMMARY = "A C++ toolbox - binary RPC package"
DESCRIPTION = "Cxxtools is a collection of general-purpose C++ classes. The library \
includes classes for serialization, unicode text, multi threading, \
networking, rpc, http client and server, xml, logging and many more."
LICENSE = "LGPL-2.1-only"

PV = "3.0"

RPM_NAME = "libcxxtools-bin10-3.0-5.1.aarch64.rpm"
RPM_HASH = "d5685299c1bd5ce6d8b8b9bb007e5d748d216e213ca650ed2e3696b629adc47018830e899e836d40a6fcce9e9c90567f79e4222c7949ddb52b473dd79067060f"

RPROVIDES:${PN} += "libcxxtools-bin.so.10 \
libcxxtools-bin10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
