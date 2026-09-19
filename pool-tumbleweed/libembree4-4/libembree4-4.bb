SUMMARY = "Shared library providing Embree raytracing kernels"
DESCRIPTION = "Embree is a collection of ray tracing kernels. \
 \
This package contains the shared library."
LICENSE = "Apache-2.0"

PV = "4.4.1"

RPM_NAME = "libembree4-4-4.4.1-1.3.aarch64.rpm"
RPM_HASH = "4a2f88f44eb79bbb9b355faa490aff6cf1c1d9b5af41d7e0f7c08355d85cc2a53fa91ec5e212fc0b772653b01ef101b80bae5b576101ef2858e7514a4ab3ca81"

RPROVIDES:${PN} += "libembree4-4 \
libembree4.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
