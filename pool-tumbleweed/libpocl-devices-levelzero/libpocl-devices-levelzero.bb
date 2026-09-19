SUMMARY = "Level Zero device for pocl"
DESCRIPTION = "Portable Computing Language (pocl) is an implementation of the OpenCL standard \
which can be adapted for new targets and devices, both for homogeneous CPU and \
heterogenous GPUs/accelerators. \
 \
This subpackage contains the Level Zero device for pocl."
LICENSE = "MIT"

PV = "7.1"

RPM_NAME = "libpocl-devices-levelzero-7.1-2.2.aarch64.rpm"
RPM_HASH = "f35c1d3343e22aa04f16a4f13c37d149d61b6362318016daa324d0f3e2dec2367c51bd68a0bca2606d2ccaa45dcece939884a8193ea3c96775f7a190bf5a4f86"

RPROVIDES:${PN} += "libpocl-devices-level0.so \
libpocl-devices-levelzero"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpocl.so.2 \
libstdc++.so.6 \
libze-loader.so.1"

inherit rpm
