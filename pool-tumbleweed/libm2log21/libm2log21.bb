SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "16.2.0+git9497"

RPM_NAME = "libm2log21-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "4a38c8db402fada00f761dbc70f2cd2f70b24ac9df749cb1557c519a91465e52b47ec0e9b206a32bc391cb51c6faf83f14edc567ec5528567dd192079e3021e0"

RPROVIDES:${PN} += "libm2log.so.21 \
libm2log21"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6"

inherit rpm
