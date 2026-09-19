SUMMARY = "The GNU Fortran Compiler Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran compiler \
of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "16.2.0+git9497"

RPM_NAME = "libgfortran5-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "9df0618d7621301dd5ad1aff3d7ef47a45a42ad5b8a0ae235611a0698aec6526d04eb7c00d7efcea346ddf01a9f535ae4e8366ce3c99bc927193d5b48753e732"

RPROVIDES:${PN} += "libgfortran.so.5 \
libgfortran5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
