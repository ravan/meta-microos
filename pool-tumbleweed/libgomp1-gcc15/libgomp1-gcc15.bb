SUMMARY = "The GNU compiler collection OpenMP runtime library"
DESCRIPTION = "This is the OpenMP runtime library needed by OpenMP enabled programs \
that were built with the -fopenmp compiler option and by programs that \
were auto-parallelized via the -ftree-parallelize-loops compiler \
option."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "15.3.0+git11272"

RPM_NAME = "libgomp1-gcc15-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "05a7084a9de4efcf4fd7a714f03d60b414d89cdcbe63c104244234a1647add6b736bff6d7bf76c6880d04bd3788284f97408ece5d579e52452fea013c3a3276e"

RPROVIDES:${PN} += "libgomp.so.1 \
libgomp1 \
libgomp1-gcc15"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
