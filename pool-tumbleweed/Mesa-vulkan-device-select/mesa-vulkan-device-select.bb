SUMMARY = "Vulkan layer to select Vulkan devices provided by Mesa"
DESCRIPTION = "This package contains the VK_MESA_device_select Vulkan layer"
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "Mesa-vulkan-device-select-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "ad5f6ca6d1eb68eaa7970a8c7f3073926a697018fb350af626f7c88b1cd73aba98ad93dfe321bf567520781d42a3c7fae320f778b952582e8b1535695daf6061"

RPROVIDES:${PN} += "Mesa-vulkan-device-select \
libVkLayer-MESA-device-select.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libwayland-client.so.0 \
libxcb-dri3.so.0 \
libxcb.so.1"

inherit rpm
