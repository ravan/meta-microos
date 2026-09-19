SUMMARY = "Wayland compositor inspired by WindowMaker"
DESCRIPTION = "A Wayland compositor inspired by Window Maker \
 \
Key features: \
  - Compositor for windows in stacking mode \
  - Supports multiple workspaces \
  - Appearance inspired by Window Maker, following the look and feel of \
    NeXTSTEP \
  - Easy to use, lightweight, low gimmicks and fast \
  - Dock and clip, to be extended for dockable apps"
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "wlmaker-0.7.1-1.4.aarch64.rpm"
RPM_HASH = "61b241ff1efeeff24956bf91e08d108f7cf3ab39eda5a667dcbb3d96e0f175490609c4f3c60122fd5e7bb85f8f70dba8052d264a60e0a15f0d0bec8ba9f9978c"

RPROVIDES:${PN} += "wlmaker"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libm.so.6 \
libwayland-client.so.0 \
libwayland-server.so.0 \
libwlroots-0.19.so \
libxcb.so.1 \
libxdg-basedir.so.1 \
libxkbcommon.so.0"

inherit rpm
