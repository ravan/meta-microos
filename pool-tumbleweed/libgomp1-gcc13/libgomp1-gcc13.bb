SUMMARY = "The GNU compiler collection OpenMP runtime library"
DESCRIPTION = "This is the OpenMP runtime library needed by OpenMP enabled programs \
that were built with the -fopenmp compiler option and by programs that \
were auto-parallelized via the -ftree-parallelize-loops compiler \
option."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.5.0+git10516"

RPM_NAME = "libgomp1-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "cf4f7ec1321fbb27b28a11cb80c08536c31f58f8089c1dd88330b013ea771520a62ca86069186680dfec76a68c49b3a0bd0c72fabe1fc5ba5092eda1a945ed45"

RPROVIDES:${PN} += "libgomp.so.1 \
libgomp1 \
libgomp1-gcc13"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
