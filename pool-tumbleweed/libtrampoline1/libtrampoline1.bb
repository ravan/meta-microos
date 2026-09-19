SUMMARY = "FFI library for closures as first-class C functions"
DESCRIPTION = "A library for building foreign function call interfaces in embedded \
interpreters. \
This library allows using closures (lambdas) as first-class C \
functions."
LICENSE = "GPL-2.0-or-later"

PV = "2.5"

RPM_NAME = "libtrampoline1-2.5-1.9.aarch64.rpm"
RPM_HASH = "49e6c877335eb8e3d9cbafaa980a358c89a6604d36fb7ae20cdf8ce26bd5de8cdbb96ece46f191f9c0df1c9fbf33c92d71b01ee7bf7f6a771cbb4ca89e9d17bf"

RPROVIDES:${PN} += "libtrampoline.so.1 \
libtrampoline1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
