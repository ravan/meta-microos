SUMMARY = "Development files for the Portable Computing Language"
DESCRIPTION = "Portable Computing Language (pocl) is an implementation of the OpenCL standard \
which can be adapted for new targets and devices, both for homogeneous CPU and \
heterogenous GPUs/accelerators. \
 \
This subpackage provides the development files needed for pocl."
LICENSE = "MIT"

PV = "7.1"

RPM_NAME = "pocl-devel-7.1-2.2.aarch64.rpm"
RPM_HASH = "dc2e714ed8d6ad22a58d96d00e1408ba1078465ef77ccfe9ead1baa454166e4d41d7a39d3fa7c8ea6afebd7fceeba0fa20e07e44c0351c78d40437823fc766d4"

RPROVIDES:${PN} += "pkgconfig-pocl \
pocl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpocl2 \
opencl-headers \
pocl"

inherit rpm
