SUMMARY = "TBB device for pocl"
DESCRIPTION = "Portable Computing Language (pocl) is an implementation of the OpenCL standard \
which can be adapted for new targets and devices, both for homogeneous CPU and \
heterogenous GPUs/accelerators. \
 \
This subpackage contains the Thread Building Blocks (TBB) device for pocl."
LICENSE = "MIT"

PV = "7.1"

RPM_NAME = "libpocl-devices-tbb-7.1-2.2.aarch64.rpm"
RPM_HASH = "23fbf2d3ad6e045c4aac6867f2ac2105a5d7bd2a509fe814bd9c2bbdeef5aa85ef3437369b2d37590db338c6964828509eba397b863cbe899873333ebf2ad6e2"

RPROVIDES:${PN} += "libpocl-devices-tbb \
libpocl-devices-tbb.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpocl-devices-pthread.so \
libpocl.so.2 \
libstdc++.so.6 \
libtbb.so.12"

inherit rpm
