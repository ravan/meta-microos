SUMMARY = "GNUnet library libgnunetdatacache"
DESCRIPTION = "This package contains the libgnunetdatacache library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetdatacache0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "375fe5e10d395779bbdcedfcf30e2597ad57a71cc1281fa001df67f5c37b4186d70f4deda7d96cd3639b7a53b72967feb3d911ab54515808d2e147c29349f643"

RPROVIDES:${PN} += "libgnunetdatacache.so.0 \
libgnunetdatacache0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetstatistics.so.2 \
libgnunetutil.so.20"

inherit rpm
