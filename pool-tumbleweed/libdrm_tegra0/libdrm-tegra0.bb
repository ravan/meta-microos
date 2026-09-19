SUMMARY = "Userspace interface to kernel DRM services for Nvidia Tegra chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface to kernel DRM services \
for Nvidia Tegra chips."
LICENSE = "MIT"

PV = "2.4.134"

RPM_NAME = "libdrm_tegra0-2.4.134-2.2.aarch64.rpm"
RPM_HASH = "4d3dee3f59a83c0cd843fa5982d4fac8c523a9805d8822ccbee83912753023399c1816ca295362a835ad5c7682bab3da10c863da91de7d1717102dc8f65587e4"

RPROVIDES:${PN} += "libdrm-tegra.so.0 \
libdrm-tegra0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
