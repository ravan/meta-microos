SUMMARY = "File compression utility"
DESCRIPTION = "A gzip implementation that uses libdeflate which is significantly \
faster than the GNU gzip implementation (+72-187%)."
LICENSE = "BSD-2-Clause"

PV = "1.25"

RPM_NAME = "libdeflate-tools-1.25-1.4.aarch64.rpm"
RPM_HASH = "5e0394ed2e7841f3cce998b6fcb9b51c8e16976f1e9efb409f4d3036c8085b6414a1f6e31f9c18365e4253d931682a3e1c6fd373615c41c784eb8811639f72d6"

RPROVIDES:${PN} += "libdeflate-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdeflate.so.0"

inherit rpm
