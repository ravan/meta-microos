SUMMARY = "Discrete Fourier Transform (DFT) C subroutine library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-mpi-devel-3.3.10-6.6.aarch64.rpm"
RPM_HASH = "69abb62381c161108afcbd130e6134f9071da6e034ab92c6ec4a6aa5bc84279a6167d338cc67a107193e24108c406d6737efa3bbaf142af2933a363e4f5e33f5"

RPROVIDES:${PN} += "fftw3-mpi-devel"

RDEPENDS:${PN} += "fftw3-devel \
glibc-devel \
libfftw3-mpi3 \
openmpi-devel"

inherit rpm
