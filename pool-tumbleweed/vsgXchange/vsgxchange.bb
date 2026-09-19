SUMMARY = "3D graphics toolkit"
DESCRIPTION = "Utility library for converting data+materials to/from VulkanSceneGraph."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "vsgXchange-1.0.5-2.5.aarch64.rpm"
RPM_HASH = "e0ba98bf36347d539113ae78a908aa7f6ff34dd861e004b56d7feea881ea929f4729189e81ec5b60bf6066a59eb4a13082d1dcee9cef45e41d855890d9a75d16"

RPROVIDES:${PN} += "vsgXchange"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvsg.so.14 \
libvsgXchange.so.1"

inherit rpm
