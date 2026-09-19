SUMMARY = "Discrete Fourier Transform (DFT) C Subroutine Library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3-3-3.3.10-6.6.aarch64.rpm"
RPM_HASH = "658723089c3a368bccf81c3af831d2b20de64e91e8e998da26ca3d745f8cb352d97bb017e26d60f433de842fed5a2f95b5a50c0ea404b095fdda5e813dc99f93"

RPROVIDES:${PN} += "fftw3 \
libfftw3-3 \
libfftw3.so.3 \
libfftw3f.so.3 \
libfftw3l.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
