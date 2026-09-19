SUMMARY = "Library files for libuser"
DESCRIPTION = "Library files for libuser."
LICENSE = "LGPL-2.0-or-later"

PV = "0.64"

RPM_NAME = "libuser1-0.64-2.7.aarch64.rpm"
RPM_HASH = "31fed57aeca576467fbef86918ac3967de2e7feec7a69362105a0750cab4b4abfdca99809e6f6c135a4e500cc70ac284640cf87273024973e0361b9b59cd3fbb"

RPROVIDES:${PN} += "libuser.so.1 \
libuser1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libcrypt.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libselinux.so.1"

inherit rpm
