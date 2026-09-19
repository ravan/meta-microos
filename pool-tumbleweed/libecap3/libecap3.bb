SUMMARY = "Library implementing the eCAP interface for application filtering modules"
DESCRIPTION = "eCAP is a software interface that allows a network application, such as an http \
proxy or an icap server, to outsource content analysis and adaptation to a \
loadable module. the functionality is similar to the icap protocol (rfc 3507), \
but implemented as function calls instead of network interactions. \
 \
This package contains the shared library."
LICENSE = "BSD-2-Clause"

PV = "1.0.1"

RPM_NAME = "libecap3-1.0.1-1.5.aarch64.rpm"
RPM_HASH = "2369f1bfae518957e00da1a67dc713771aa7f44bc276e721f47e7f6f83d106049c9eae9a629eb3b9a70ab9911e1db7213c5fd1a228da73a08988fd10be1113c0"

RPROVIDES:${PN} += "libecap.so.3 \
libecap3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
