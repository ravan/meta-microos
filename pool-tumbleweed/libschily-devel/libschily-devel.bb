SUMMARY = "Development files for libschily"
DESCRIPTION = "libschily contains many OS abstraction functions used by the Schily \
tools. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libschily."
LICENSE = "CDDL-1.0"

PV = "2024.03.21"

RPM_NAME = "libschily-devel-2024.03.21-53.5.aarch64.rpm"
RPM_HASH = "1dd4e850db009f8b23f38ba1ce1d580b56fca1eb0b484b9c386ac6ed3c5e51690abe1fe4ca3c87242aeeeb07a8a29049ffde4f051b8eedf22b2ecfe1043b53fe"

RPROVIDES:${PN} += "libschily-devel"

RDEPENDS:${PN} += "libcdrdeflt1-0 \
libdeflt1-0 \
libedc-ecc-dec1-0 \
libedc-ecc1-0 \
libfile1-0 \
libfind4-0 \
librmt1-0 \
libschily2-0 \
libxtermcap1-0"

inherit rpm
