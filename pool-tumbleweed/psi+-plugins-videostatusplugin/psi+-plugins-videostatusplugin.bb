SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to set the custom status when you see the video in \
selected video player."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-videostatusplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "4c96d7a8804076701eab50404b377377fb5c385c78d3d14066620f3181cf25163ff2ebb6a18f390a1b6bdc3a7b74d4f04bdc86058af2c056829275fda8ce7126"

RPROVIDES:${PN} += "libvideostatusplugin.so \
psi+-plugins-videostatusplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxcb.so.1 \
psi+"

inherit rpm
