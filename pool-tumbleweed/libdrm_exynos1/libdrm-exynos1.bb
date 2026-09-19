SUMMARY = "Userspace interface to kernel DRM services for Samsung Exynos chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface to kernel DRM services \
for Samsung Exynos chips."
LICENSE = "MIT"

PV = "2.4.134"

RPM_NAME = "libdrm_exynos1-2.4.134-2.2.aarch64.rpm"
RPM_HASH = "f4ce4c447a95c019a331ca8677927ae8d3c478a16dfd2c8b39311794a8feb5808a65c82f8a7907b7c244ef8dd24e391610361fbc9b283250e17e6ecbee2e9307"

RPROVIDES:${PN} += "libdrm-exynos.so.1 \
libdrm-exynos1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
