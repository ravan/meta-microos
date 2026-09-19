SUMMARY = "GNUnet library libgnunetpq"
DESCRIPTION = "This package contains the libgnunetpq library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetpq5-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "ef240282660fcd6433fff90f58b7c69e51f897b756ac2f7c4755448e8846b3fb72cf5be2b0026667889b10575d5ef029eb1fde788e4c2392be90675662e962b5"

RPROVIDES:${PN} += "libgnunetpq.so.5 \
libgnunetpq5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20 \
libpq.so.5"

inherit rpm
