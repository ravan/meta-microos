SUMMARY = "Weston rendering backend collection"
DESCRIPTION = "This subpackage contains backend renderer plugins, used by \
libweston-16-0."
LICENSE = "CC-BY-SA-3.0 & MIT"

PV = "16.0.0"

RPM_NAME = "libweston-16-16.0.0-1.1.aarch64.rpm"
RPM_HASH = "c9b3189065d08a6c12f069f27b7f55b39cfd15169cde7269f1f0682a17207d1afeca9d5e60cf46228a9338e48561e1c5f0702a69fd3c0df6220fcb02f1b22914"

RPROVIDES:${PN} += "libweston-16"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libX11-xcb.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libc.so.6 \
libcairo.so.2 \
libdisplay-info.so.3 \
libdrm.so.2 \
libfreerdp-server3.so.3 \
libfreerdp3.so.3 \
libgbm.so.1 \
libinput.so.10 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libpipewire-0.3.so.0 \
libpixman-1.so.0 \
libpng16.so.16 \
libseat.so.1 \
libudev.so.1 \
libvulkan.so.1 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libwayland-egl.so.1 \
libwayland-server.so.0 \
libwebp.so.7 \
libweston-16.so.0 \
libwinpr3.so.3 \
libxcb-composite.so.0 \
libxcb-render.so.0 \
libxcb-shm.so.0 \
libxcb-xfixes.so.0 \
libxcb-xkb.so.1 \
libxcb.so.1 \
libxkbcommon.so.0"

inherit rpm
