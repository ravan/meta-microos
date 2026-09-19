SUMMARY = "Shared library for ecryptfs-utils"
DESCRIPTION = "A stacked cryptographic filesystem for Linux."
LICENSE = "GPL-2.0-only"

PV = "111"

RPM_NAME = "libecryptfs1-111-9.9.aarch64.rpm"
RPM_HASH = "295bf1b7041773283f77121428232973bd3ff95fc454d128fcfa118ff8f981dc1174c61cb55823d1f8bbf01fa5a4484a87cc3b038e2e970cdc9d969780980f1c"

RPROVIDES:${PN} += "libecryptfs.so.1 \
libecryptfs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkeyutils.so.1 \
libnss3.so"

inherit rpm
