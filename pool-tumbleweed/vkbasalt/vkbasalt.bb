SUMMARY = "Vulkan post processing layer"
DESCRIPTION = "vkBasalt is a Vulkan post processing layer to enhance the visual graphics of games."
LICENSE = "Zlib"

PV = "0.3.2.10"

RPM_NAME = "vkbasalt-0.3.2.10-3.9.aarch64.rpm"
RPM_HASH = "7b6f5232c3048ef081c3b62341299a96ddf84e57b75aa713c6aed80f6a88c127e4697a661522aa9adbf539510080737a029fde3d2f8256f2cfd4f8b5f34ef1fd"

RPROVIDES:${PN} += "config-vkbasalt \
libvkbasalt.so \
vkbasalt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
