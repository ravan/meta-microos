SUMMARY = "Applications demoing the libsolv library"
DESCRIPTION = "Applications demoing the libsolv library."
LICENSE = "BSD-3-Clause"

PV = "0.7.39"

RPM_NAME = "libsolv-demo-0.7.39-1.4.aarch64.rpm"
RPM_HASH = "8e8302b9a09e8b97f2230ac3ea07743a6d06d3a4527ce7da81124af6603b33bf79c7656a99e9f8f1861c75cbde0fb771ead12ec034343c3fc953c567fefa5504"

RPROVIDES:${PN} += "libsolv-demo"

RDEPENDS:${PN} += "curl \
gpg2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsolv.so.1 \
libsolvext.so.1"

inherit rpm
