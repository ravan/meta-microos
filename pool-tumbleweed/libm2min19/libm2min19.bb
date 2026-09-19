SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "14.4.0+git12698"

RPM_NAME = "libm2min19-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "cfd7fffbc47029d0b8231a45ad8b161b66844ecf055d62174aadbedaac2a1d46053b692579830349f498b1108bb88005b0032908ba4cdffb84cdaab1f1be2c8c"

RPROVIDES:${PN} += "libm2min.so.19 \
libm2min19"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
