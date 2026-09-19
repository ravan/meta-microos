SUMMARY = "Library for manipulating FITS data files"
DESCRIPTION = "CFITSIO is a library of C and Fortran subroutines for reading and writing data \
files in FITS (Flexible Image Transport System) data format. CFITSIO provides \
simple high-level routines for reading and writing FITS files that insulate the \
programmer from the internal complexities of the FITS format. CFITSIO also \
provides many advanced features for manipulating and filtering the information \
in FITS files. \
 \
This package contains some FITS image compression and decompression utilities."
LICENSE = "NASA-1.3"

PV = "4.7.0"

RPM_NAME = "cfitsio-4.7.0-1.1.aarch64.rpm"
RPM_HASH = "c46905e8a9dfc2eb78e79ac0336f28c89b802cb48970af9790ae49bc720ad667e576695b2f39f20e102891c8e01563a8bdb2cca18801bc37dbf647b06ceaa638"

RPROVIDES:${PN} += "cfitsio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libm.so.6"

inherit rpm
