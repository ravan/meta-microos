SUMMARY = "NSS NIS plugin for glibc"
DESCRIPTION = "The NSS NIS plugin provides NIS support for get*nam() functions from \
glibc. This version is IPv6 capable."
LICENSE = "LGPL-2.1-only"

PV = "3.4"

RPM_NAME = "libnss_nis2-3.4-1.5.aarch64.rpm"
RPM_HASH = "92b1558b7ffd67f9ded18a9698a698538737e36df6e88f0b778788c992da015f29c07e0dbf255d413fcfbf4891451328521aaf32011d2fc5593287f7023d57d3"

RPROVIDES:${PN} += "glibc-/lib64/libnss-nis.so.2 \
libnss-nis.so.2 \
libnss-nis2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnsl.so.3"

inherit rpm
