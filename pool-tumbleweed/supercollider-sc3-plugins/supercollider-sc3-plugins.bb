SUMMARY = "Collection of SuperCollider plugins"
DESCRIPTION = "Collection of free and usefull SuperCollider plugins"
LICENSE = "GPL-3.0-only"

PV = "3.13.0"

RPM_NAME = "supercollider-sc3-plugins-3.13.0-3.3.aarch64.rpm"
RPM_HASH = "289df34502348b6873cec94071b27481595eab63b1e7af8c0b423f911de1faff5e403f33dee965b5afa1ccdf326364e01ab83c922f004e59b09745b17bf6e502"

RPROVIDES:${PN} += "supercollider-sc3-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
supercollider"

inherit rpm
