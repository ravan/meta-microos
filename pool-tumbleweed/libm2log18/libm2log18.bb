SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.5.0+git10516"

RPM_NAME = "libm2log18-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "f078deedfb37ef704c22587babec1a99dd8b96320b101392f2f6fc90505a1b3967f331cf1c9d603d52c30f28cca1769f3cf9d5f029ad69f3e353a4535ccba9d3"

RPROVIDES:${PN} += "libm2log.so.18 \
libm2log18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
