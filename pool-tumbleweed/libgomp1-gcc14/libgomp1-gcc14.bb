SUMMARY = "The GNU compiler collection OpenMP runtime library"
DESCRIPTION = "This is the OpenMP runtime library needed by OpenMP enabled programs \
that were built with the -fopenmp compiler option and by programs that \
were auto-parallelized via the -ftree-parallelize-loops compiler \
option."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "14.4.0+git12698"

RPM_NAME = "libgomp1-gcc14-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "da1f596132f631bdb8d53e74db62616232314f262b52496b223bc0d1772dce629cf8a3965f3c0e7fd7802ea5dd2a38a78647760f69dc0f454d428096ef6a7dd4"

RPROVIDES:${PN} += "libgomp.so.1 \
libgomp1 \
libgomp1-gcc14"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
