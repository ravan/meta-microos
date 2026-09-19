SUMMARY = "GNUnet library libgnunetnse"
DESCRIPTION = "This package contains the libgnunetnse library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetnse0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "aeebb18eab0362dd63aaf956da709abdff25046658dc394e843b4980193f5f8820bad524e57d99a02ee42800e77344f2ba6b7f42e41c8f87c483ab3c9a4fbbc7"

RPROVIDES:${PN} += "libgnunetnse.so.0 \
libgnunetnse0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
