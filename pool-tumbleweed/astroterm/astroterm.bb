SUMMARY = "Terminal-based planetarium"
DESCRIPTION = "A planetarium for your terminal! Explore stars, planets, constellations, and \
more, all rendered right in the command line - no telescope required."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "astroterm-1.2.0-2.1.aarch64.rpm"
RPM_HASH = "7a5f844322833aa0741c777345df998bf24b0cdfb5743a39d7caa33cbcdf0bb75a9e1c58c7dc18394ca994a3f78a232e05bf50307b4207848786e54b5cf9adc8"

RPROVIDES:${PN} += "astroterm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libargtable3.so.3 \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
