SUMMARY = "GNUnet library libgnunetdht"
DESCRIPTION = "This package contains the libgnunetdht library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetdht4-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "3d0712c80b635169851b70f57492d12c540c48e75cecf4a24fc11ad52a5d4ec14a19593adad3cf8402a089ee442e8b0bd2415e237106861948a9bc79a686fd21"

RPROVIDES:${PN} += "libgnunetdht.so.4 \
libgnunetdht4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
