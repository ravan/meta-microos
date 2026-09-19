SUMMARY = "Discrete Fourier Transform (DFT) C subroutine library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3_mpi3-3.3.10-6.6.aarch64.rpm"
RPM_HASH = "c8d25bd086c27880d50696bc913d420432b55586630731ebdb941f102b10343338d138b33fb60dba1bcfa22803acd53f63df9b8d7d9a6e4925567170d1469007"

RPROVIDES:${PN} += "fftw3-mpi \
libfftw3-mpi.so.3 \
libfftw3-mpi3 \
libfftw3f-mpi.so.3 \
libfftw3l-mpi.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libfftw3f.so.3 \
libfftw3l.so.3"

inherit rpm
