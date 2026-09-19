SUMMARY = "A C++ toolbox - JSON package"
DESCRIPTION = "Cxxtools is a collection of general-purpose C++ classes. The library \
includes classes for serialization, unicode text, multi threading, \
networking, rpc, http client and server, xml, logging and many more."
LICENSE = "LGPL-2.1-only"

PV = "3.0"

RPM_NAME = "libcxxtools-json10-3.0-5.1.aarch64.rpm"
RPM_HASH = "ab031d81db674e196724fc6b743b56df71700ff544cf475d3bde886ff2ca36a0cfc46af531597ca516b6b279f1378a167f2fecb56f60d06f7ce3d27a5549e5c7"

RPROVIDES:${PN} += "libcxxtools-json.so.10 \
libcxxtools-json10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools-http.so.10 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
