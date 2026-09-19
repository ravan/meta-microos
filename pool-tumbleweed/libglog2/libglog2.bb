SUMMARY = "Logging library for C++"
DESCRIPTION = "The glog library implements application-level logging. \
This library provides logging APIs based on C++-style \
streams and various helper macros."
LICENSE = "BSD-3-Clause"

PV = "0.7.1"

RPM_NAME = "libglog2-0.7.1-1.7.aarch64.rpm"
RPM_HASH = "dbfae3d18a67b9b76460eb4102b0218aae0c3d3f373cc26678adee50548cc84da5eda3426f135f1dc6d2089f043c04de656f683cab3ff7eda410bc53aba79d51"

RPROVIDES:${PN} += "libglog.so.2 \
libglog2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
