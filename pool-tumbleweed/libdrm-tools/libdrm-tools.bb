SUMMARY = "Diagnostic utilities for DRI and DRM"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems that support the ioctl \
interface, and for chipsets with DRM memory manager, support for \
tracking relocations and buffers. libdrm is a low-level library, \
typically used by graphics drivers such as the Mesa DRI and X \
drivers. \
 \
This package contains diagnostic utilities for DRI and DRM."
LICENSE = "MIT"

PV = "2.4.134"

RPM_NAME = "libdrm-tools-2.4.134-2.2.aarch64.rpm"
RPM_HASH = "7cd56ac4ca668af5b6c4d63ce23b72b9096810ecdc9be847c3964af30771855f4a7d0fce738bd562b67443d0881872b25263f651cd0f25a0db41fa7fb0cb3e81"

RPROVIDES:${PN} += "libdrm \
libdrm-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm-amdgpu.so.1 \
libdrm-etnaviv.so.1 \
libdrm-exynos.so.1 \
libdrm-tegra.so.0 \
libdrm.so.2"

inherit rpm
