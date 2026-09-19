SUMMARY = "Library for manipulating FITS data files"
DESCRIPTION = "CFITSIO is a library of C and Fortran subroutines for reading and writing data \
files in FITS (Flexible Image Transport System) data format. CFITSIO provides \
simple high-level routines for reading and writing FITS files that insulate the \
programmer from the internal complexities of the FITS format. CFITSIO also \
provides many advanced features for manipulating and filtering the information \
in FITS files."
LICENSE = "NASA-1.3"

PV = "4.7.0"

RPM_NAME = "libcfitsio10-4.7.0-1.1.aarch64.rpm"
RPM_HASH = "7a75c92cd49dc4786c2e30d5a3b42ab1d46e7c0fe5860a8e5232135745a10d51d0612f3030b75dd2d859d6f95cd7e220690adffbab970de8fdd933ed0f1ae404"

RPROVIDES:${PN} += "libcfitsio.so.10 \
libcfitsio10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcurl.so.4 \
libm.so.6 \
libz.so.1"

inherit rpm
