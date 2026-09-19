SUMMARY = "GameStream client for PCs"
DESCRIPTION = " \
Moonlight PC is an open source PC client for NVIDIA GameStream and Sunshine."
LICENSE = "GPL-3.0-only"

PV = "6.1.0"

RPM_NAME = "moonlight-6.1.0-1.11.aarch64.rpm"
RPM_HASH = "71ad34cd227ee5220338fbb97ebba32f1beead9c7ef56230dce08617550fdc63fd7a37be4dcb347572fcf873d71f6741d77f9301e0c2cd76ccb32cabd3a91459"

RPROVIDES:${PN} += "moonlight"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6QuickControls2.so.6 \
libQt6Svg.so.6 \
libSDL2-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libX11.so.6 \
libavcodec.so.62 \
libavutil.so.60 \
libc.so.6 \
libcrypto.so.3 \
libdrm.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libopus.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libswscale.so.9 \
libva-drm.so.2 \
libva-wayland.so.2 \
libva-x11.so.2 \
libva.so.2 \
libwayland-client.so.0"

inherit rpm
