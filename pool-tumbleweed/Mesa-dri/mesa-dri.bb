SUMMARY = "DRI plug-ins for 3D acceleration"
DESCRIPTION = "This package contains Mesa DRI drivers for 3D acceleration."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "Mesa-dri-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "bbde0669b057c38f6ad98063fc0c1177d41fe57a0eb79d73b419eac46f2116cd90f987b409fe232ea8ca9f253ca6886c431d572f808fe2b5a21854de26721fdf"

RPROVIDES:${PN} += "Mesa-dri \
config-Mesa-dri \
libdril-dri.so \
libgallium-26.2.2.so"

RDEPENDS:${PN} += "Mesa \
ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libSPIRV-Tools-2026.3~rc1.so \
libX11-xcb.so.1 \
libc.so.6 \
libdrm-amdgpu.so.1 \
libdrm.so.2 \
libelf.so.1 \
libexpat.so.1 \
libgbm.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvulkan-lvp \
libvulkan1 \
libxcb-dri3.so.0 \
libxcb-present.so.0 \
libxcb-randr.so.0 \
libxcb-sync.so.1 \
libxcb-xfixes.so.0 \
libxcb.so.1 \
libxshmfence.so.1 \
libz.so.1"

inherit rpm
