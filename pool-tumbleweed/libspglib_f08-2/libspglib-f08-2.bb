SUMMARY = "Shared library for SPGLIB fortran bindings"
DESCRIPTION = "Spglib is a C library to find and handle crystal symmetries. \
 \
This package provides the shared library for fortran bindings of spglib."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "libspglib_f08-2-2.4.0-1.9.aarch64.rpm"
RPM_HASH = "95b7c7536317a7d6e6a515d79ab525e926326f15403e49a85d2cdaa6c3bf3fcf7ecaafd037ec31c022b8003e91edbd1ae4764b4305e0c581e4cee60717a13dd7"

RPROVIDES:${PN} += "libspglib-f08-2 \
libspglib-f08.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libsymspg.so.2"

inherit rpm
