SUMMARY = "Modular Wayland compositor library"
DESCRIPTION = "Pluggable, composable modules for building a Wayland compositor."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "libwlroots12-0.17.3-2.6.aarch64.rpm"
RPM_HASH = "4349398f4e78bf6079c36d5b11f3a1e71163ef5ebbc3a2bdc84de4d100b488c7d1d858073d684fae385ca5e7c059a01f9ec26e71bfe6f76e329e89852dd51e17"

RPROVIDES:${PN} += "libwlroots.so.12 \
libwlroots12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libc.so.6 \
libdisplay-info.so.3 \
libdrm.so.2 \
libgbm.so.1 \
libinput.so.10 \
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
