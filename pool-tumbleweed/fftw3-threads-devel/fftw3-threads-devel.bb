SUMMARY = "Discrete Fourier Transform (DFT) C subroutine library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-threads-devel-3.3.10-6.6.aarch64.rpm"
RPM_HASH = "92fd1ec66bf2ef80bff10020d87a8a2b627e469961623acfd1a645d1115f7bc32814595324ad77c88244bc97760343abb6831e094c15a40730395f7101a95473"

RPROVIDES:${PN} += "fftw3-threads-devel"

RDEPENDS:${PN} += "fftw3-devel \
glibc-devel \
libfftw3-threads3"

inherit rpm
