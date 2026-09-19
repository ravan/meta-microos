SUMMARY = "OpenGL Plugin for HWLOC (NVIDIA Only)"
DESCRIPTION = "Plugin for HWLOC to detect and enumerate OpenGL devices. This works only \
for NVIDIA devices running the proprietary driver by using the NV-CONTROL \
X Window System extension."
LICENSE = "BSD-3-Clause"

PV = "2.13.0"

RPM_NAME = "hwloc-gl-2.13.0-1.3.aarch64.rpm"
RPM_HASH = "480b777a9b1b61e3f8984bf7d121d404374d9d844dd8c5cd4082f8c78d1dfc10d20ccb3ba11ae8de2c975cb24ad17fe21a9afa5b71f07afcabecc2c2b10e2abc"

RPROVIDES:${PN} += "hwloc-gl"

RDEPENDS:${PN} += "hwloc \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXNVCtrl.so.0 \
libc.so.6"

inherit rpm
