SUMMARY = "Library for graph filtering"
DESCRIPTION = "The gvpr library allows an application to perform general-purpose graph \
manipulation and filtering based on an awk-like language"
LICENSE = "EPL-2.0"

PV = "15.0.0"

RPM_NAME = "libgvpr2-15.0.0-2.2.aarch64.rpm"
RPM_HASH = "bc695211d7cdcd951a44fb778b8f810970af9a098b89539e35928380bf933be3c6e23903c792cc0a99c991e0881c78d50997fd129aa72728205da8c6c289c65b"

RPROVIDES:${PN} += "libgvpr.so.2 \
libgvpr2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdt.so.6 \
libcgraph.so.8 \
libm.so.6"

inherit rpm
