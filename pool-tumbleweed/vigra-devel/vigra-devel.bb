SUMMARY = "Development files for VIGRA Library"
DESCRIPTION = "VIGRA stands for 'Vision with Generic Algorithms'. It is a novel \
computer vision library that puts its main emphasis on customizable \
algorithms and data structures. By using template techniques similar to \
those in the C++ Standard Template Library, you can easily adapt any \
VIGRA component to the needs of your application, without giving up \
execution speed."
LICENSE = "MIT"

PV = "1.12.2"

RPM_NAME = "vigra-devel-1.12.2-1.14.aarch64.rpm"
RPM_HASH = "c2520ec0a19fd1ee7926c2443d937a219b88724aba1b74995ce6c69e9f747e043863a3442cddd4fbd528f7382d95c11f6a762c842afac74ab721936dd5be160e"

RPROVIDES:${PN} += "cmake-Vigra \
vigra-devel"

RDEPENDS:${PN} += "/usr/bin/python3 \
fftw3-devel \
hdf5-devel \
libjpeg-devel \
libpng-devel \
libstdc++-devel \
libtiff-devel \
libvigraimpex11 \
openexr-devel \
python3-base \
python3-numpy \
zlib-devel"

inherit rpm
