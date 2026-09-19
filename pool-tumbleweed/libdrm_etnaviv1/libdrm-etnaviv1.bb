SUMMARY = "Userspace interface to kernel DRM services for Vivante chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface to kernel DRM services \
for Vivante chips."
LICENSE = "MIT"

PV = "2.4.134"

RPM_NAME = "libdrm_etnaviv1-2.4.134-2.2.aarch64.rpm"
RPM_HASH = "25ac17d57b31adc99006989aa89458a599ebe397e9c24a5a5ce60673bd8ac27016f284a1248d8a592a07b5d81e20e9c2ba98769b322c785ecc14f046fefbb9aa"

RPROVIDES:${PN} += "libdrm-etnaviv.so.1 \
libdrm-etnaviv1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
