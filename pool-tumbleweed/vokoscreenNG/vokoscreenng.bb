SUMMARY = "Screencast creator"
DESCRIPTION = "vokoscreenNG is a user friendly Open Source screencaster for Linux and Windows."
LICENSE = "GPL-2.0-only"

PV = "4.10.0"

RPM_NAME = "vokoscreenNG-4.10.0-1.2.aarch64.rpm"
RPM_HASH = "c321d1a94798295c065dd39d0ad82c25bc5c0a9ea2c82a168a71d8e72ed347aaea407714a48d366faeb9ffda2e2dd6d0d400ca9c743c7001eb76f86623de9587"

RPROVIDES:${PN} += "vokoscreen \
vokoscreenNG"

RDEPENDS:${PN} += "gstreamer-plugins-bad \
gstreamer-plugins-base \
gstreamer-plugins-good \
gstreamer-plugins-rs \
gstreamer-plugins-ugly \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libm.so.6 \
libpulse.so.0 \
libstdc++.so.6 \
libwayland-client.so.0 \
pulseaudio-daemon"

inherit rpm
