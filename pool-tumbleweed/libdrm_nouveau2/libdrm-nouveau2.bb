SUMMARY = "Userspace interface for Kernel DRM services for NVIDIA chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface for Kernel DRM services \
for NVIDIA chips."
LICENSE = "MIT"

PV = "2.4.134"

RPM_NAME = "libdrm_nouveau2-2.4.134-2.2.aarch64.rpm"
RPM_HASH = "a52203a32b9135009615bb3d23fce581565f826d0e3428f293c5110cb679ee929cd37ddc51e671aac2f230d834c60cd9e3711703cc12b5fc3624491f165ca0f8"

RPROVIDES:${PN} += "libdrm-nouveau.so.2 \
libdrm-nouveau2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
