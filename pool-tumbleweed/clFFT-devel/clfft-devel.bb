SUMMARY = "Development files for libclfft"
DESCRIPTION = "Libraries and header files for developing applications that want to \
make use of libclFFT."
LICENSE = "Apache-2.0"

PV = "2.12.2"

RPM_NAME = "clFFT-devel-2.12.2-8.2.aarch64.rpm"
RPM_HASH = "76da81fd1c225893a4f8377615f41892cf1ef20b96ecd7802b4be35fc88bef81af97a546b093950508a9eb63a0e2e7362a44826df67269f85988626a337a3196"

RPROVIDES:${PN} += "clFFT-devel \
cmake-clFFT \
pkgconfig-clFFT"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libStatTimer2 \
libclFFT2 \
opencl-headers \
pkgconfig-OpenCL"

inherit rpm
