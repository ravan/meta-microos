SUMMARY = "Discrete Fourier Transform (DFT) C subroutine library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-openmp-devel-3.3.10-6.6.aarch64.rpm"
RPM_HASH = "8ea08d0e39a57a70cb4511d0c233db87920173376d0b01a13a06fe90937b06ff6693298ab38c4a0a93c567924812abcdb665a83adb248185d060ab8f3f1c3e64"

RPROVIDES:${PN} += "fftw3-openmp-devel"

RDEPENDS:${PN} += "fftw3-devel \
glibc-devel \
libfftw3-omp3"

inherit rpm
