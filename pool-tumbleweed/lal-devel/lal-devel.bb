SUMMARY = "Headers and source files for building against lal"
DESCRIPTION = "The LSC Algorithm Library Suite (LALSuite) is comprised of various \
gravitational wave data analysis routines written in C following the ISO/IEC \
9899:1999 standard. \
 \
This package provides the header files and sources need for building software against lal."
LICENSE = "GPL-2.0-only"

PV = "7.7.0"

RPM_NAME = "lal-devel-7.7.0-4.1.aarch64.rpm"
RPM_HASH = "860feece44cb330218ac9ce128816aa1b404aa4715a1e67e6645f1d2a92a15dacd478bf36eae6b08463e0375b2c407688b7d9c74e09232f0e075d29df27ce717"

RPROVIDES:${PN} += "lal-devel \
pkgconfig-lal \
pkgconfig-lalsupport"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libfftw3f.so.3 \
liblal.so.20 \
liblal20 \
liblalsupport.so.14 \
liblalsupport14 \
libm.so.6 \
pkgconfig-fftw3 \
pkgconfig-fftw3f \
pkgconfig-gsl \
pkgconfig-zlib"

inherit rpm
