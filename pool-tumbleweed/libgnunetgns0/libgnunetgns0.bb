SUMMARY = "GNUnet library libgnunetgns"
DESCRIPTION = "This package contains the libgnunetgns library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetgns0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "aedd6f6bb6497208eda5d1d20d6e0d0d0947c62554b8843aa29ef2a53514f2f0b925e5b77af1f729b02485853203922db35be8e829fad18c45dab43e51edbf76"

RPROVIDES:${PN} += "libgnunetgns.so.0 \
libgnunetgns0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetgnsrecord.so.0 \
libgnunetidentity.so.1 \
libgnunetutil.so.20"

inherit rpm
