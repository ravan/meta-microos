SUMMARY = "Header files for itpp"
DESCRIPTION = "This package contains the header files for the IT++ library contained in libitpp8 \
 \
IT++ is a C++ library of mathematical, signal processing and \
communication classes and functions. Its main use is in simulation of \
communication systems and for performing research in the area of \
communications. The kernel of the library consists of generic vector and \
matrix classes, and a set of accompanying routines. Such a kernel makes \
IT++ similar to MATLAB or GNU Octave."
LICENSE = "GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "itpp-devel-4.3.1-1.3.aarch64.rpm"
RPM_HASH = "41efbfcc8f5cc096006ef28724ec976998a6c96a8e8ed045eddb7e4ad182498aba532adebec5caa4ca061055df53f04a31f60f6ec19f1a2532cc28c71ae3886f"

RPROVIDES:${PN} += "itpp-devel \
libitpp8-devel \
pkgconfig-itpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
blas-devel \
lapack-devel \
libitpp8 \
pkgconfig-fftw3"

inherit rpm
