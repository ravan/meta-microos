SUMMARY = "GNUnet library libgnunetregexblock"
DESCRIPTION = "This package contains the libgnunetregexblock library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetregexblock1-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "253bab51cea85fa3655d00bc4b92036f187f4e832047c633e03acae9932d66f10f2abf3570eaaacb5f71218659a9628b97ac319949dfca34069c980281956362"

RPROVIDES:${PN} += "libgnunetregexblock.so.1 \
libgnunetregexblock1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
