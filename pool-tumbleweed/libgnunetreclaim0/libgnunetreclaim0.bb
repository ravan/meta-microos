SUMMARY = "GNUnet library libgnunetreclaim"
DESCRIPTION = "This package contains the libgnunetreclaim library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetreclaim0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "32f83b79376b51517599600441c25ed3dbfcf445fbc8e5b410d525b51f3f64c5b4c5bf3bd2a9143f8835b9f6198278b3d76d5a4cbb20a4fd8a1202dad6d1440c"

RPROVIDES:${PN} += "libgnunetreclaim.so.0 \
libgnunetreclaim0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
