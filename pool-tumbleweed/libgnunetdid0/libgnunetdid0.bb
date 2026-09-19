SUMMARY = "GNUnet library libgnunetdid"
DESCRIPTION = "This package contains the libgnunetdid library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetdid0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "183b830e560a65e7ca9a8b2c7d976f698163c68f9c22fd99c50b87b0ff52d08b1fe63d64661cfda9b69770f47cd1645591b065d28845fbceb2628462e8b42f7c"

RPROVIDES:${PN} += "libgnunetdid.so.0 \
libgnunetdid0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetgns.so.0 \
libgnunetgnsrecord.so.0 \
libgnunetidentity.so.1 \
libgnunetnamestore.so.0 \
libgnunetutil.so.20 \
libjansson.so.4"

inherit rpm
