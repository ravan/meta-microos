SUMMARY = "Modular Wayland compositor library"
DESCRIPTION = "Pluggable, composable modules for building a Wayland compositor."
LICENSE = "MIT"

PV = "0.18.2"

RPM_NAME = "libwlroots-0_18-0.18.2-3.3.aarch64.rpm"
RPM_HASH = "543d2ac6756efd252733c6f8e0a34281663957e29b0f6d0aba6976db294474ee0e0fb70a34e2280a97f766f041f25940d93b51301c46ce8a6c58ad657e9c178a"

RPROVIDES:${PN} += "libwlroots-0-18 \
libwlroots-0.18.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libc.so.6 \
libdisplay-info.so.3 \
libdrm.so.2 \
libgbm.so.1 \
libinput.so.10 \
liblcms2.so.2 \
libliftoff.so.0 \
libm.so.6 \
libpixman-1.so.0 \
libseat.so.1 \
libudev.so.1 \
libvulkan.so.1 \
libwayland-client.so.0 \
libwayland-server.so.0 \
libxcb-composite.so.0 \
libxcb-dri3.so.0 \
libxcb-errors.so.0 \
libxcb-ewmh.so.2 \
libxcb-icccm.so.4 \
libxcb-present.so.0 \
libxcb-render-util.so.0 \
libxcb-render.so.0 \
libxcb-res.so.0 \
libxcb-shm.so.0 \
libxcb-xfixes.so.0 \
libxcb-xinput.so.0 \
libxcb.so.1 \
libxkbcommon.so.0"

inherit rpm
