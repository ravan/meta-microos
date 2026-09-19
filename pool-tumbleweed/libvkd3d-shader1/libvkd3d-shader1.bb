SUMMARY = "Direct3D 12 to Vulkan translation shader library"
DESCRIPTION = "This is a Direct3D 12 to Vulkan shader library for use by e.g. Wine."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0"

RPM_NAME = "libvkd3d-shader1-2.0-1.5.aarch64.rpm"
RPM_HASH = "0fdff9a57f385d9fee1c527cb85c817febcbd46b41fbcfc7ec58db542e2d76dd1171e02302d4aecd8f655b5168ad404258c693d00133ba853c1b2ac57fd32c18"

RPROVIDES:${PN} += "libvkd3d-shader.so.1 \
libvkd3d-shader1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSPIRV-Tools-shared-2026.3~rc1.so \
libc.so.6 \
libm.so.6"

inherit rpm
