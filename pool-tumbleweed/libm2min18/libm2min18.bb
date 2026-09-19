SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.5.0+git10516"

RPM_NAME = "libm2min18-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "0a6c93629bbc8b0749961c6d2a396300006a2e401930fad31fb261fbc6917643aa21689f882233390b6d3f0866584bdf82ed55b48d3553fa5b80329cd70e4de0"

RPROVIDES:${PN} += "libm2min.so.18 \
libm2min18"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
