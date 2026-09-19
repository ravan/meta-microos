SUMMARY = "Diagnostic utilities for Vulkan"
DESCRIPTION = "Vulkan is a 3D graphics and compute API providing cross-platform \
access to modern GPUs with low overhead and targeting realtime \
graphics applications such as games and interactive media. \
 \
This package contains the Khronos official Vulkan tools and utilities."
LICENSE = "Apache-2.0"

PV = "1.4.357"

RPM_NAME = "vulkan-tools-1.4.357-1.1.aarch64.rpm"
RPM_HASH = "e26278e03c1c7355b0e9c720345f43fc0b6a145251f3e95c8563eda64669fcd4d939da582c1870458478619d5430c9361d2016320dea20475e0a3b8db4eb3e12"

RPROVIDES:${PN} += "vulkan \
vulkan-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb.so.1"

inherit rpm
