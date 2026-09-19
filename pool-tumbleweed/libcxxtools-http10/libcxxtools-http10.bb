SUMMARY = "A C++ toolbox - HTTP protocol implementation"
DESCRIPTION = "Cxxtools is a collection of general-purpose C++ classes. The library \
includes classes for serialization, unicode text, multi threading, \
networking, rpc, http client and server, xml, logging and many more."
LICENSE = "LGPL-2.1-only"

PV = "3.0"

RPM_NAME = "libcxxtools-http10-3.0-5.1.aarch64.rpm"
RPM_HASH = "4d41b4b97d3abe9c2bb29ad3375bf36ca5c0ec29ebde55f319a613f9a434e9f60ad59db61792f18fb39d3b741fff5220a7c00b6013de65c69c017cb721bcb476"

RPROVIDES:${PN} += "libcxxtools-http.so.10 \
libcxxtools-http10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
