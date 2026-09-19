SUMMARY = "Discrete Fourier Transform (DFT) C subroutine library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3_omp3-3.3.10-6.6.aarch64.rpm"
RPM_HASH = "7b98e86ed5196439ccbe5d6edd89dac4534b01ffc1c7ae21bbd5b3e0e04f9e2e4a4a5ac782d3794fe946b4a4ff0be7fbb2accca9c59f7a595a0cd959641ac1a1"

RPROVIDES:${PN} += "fftw3-openmp \
libfftw3-omp.so.3 \
libfftw3-omp3 \
libfftw3f-omp.so.3 \
libfftw3l-omp.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libfftw3f.so.3 \
libfftw3l.so.3 \
libgomp.so.1"

inherit rpm
