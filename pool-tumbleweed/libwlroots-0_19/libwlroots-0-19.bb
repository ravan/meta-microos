SUMMARY = "Modular Wayland compositor library"
DESCRIPTION = "Pluggable, composable modules for building a Wayland compositor."
LICENSE = "MIT"

PV = "0.19.3"

RPM_NAME = "libwlroots-0_19-0.19.3-1.5.aarch64.rpm"
RPM_HASH = "1cf6b9b23392cf9e7c55512cce90824845285e46d69a9e144fb4cdef5793cc3f437619a0e59b9614cbf00b965ebd3543e2392f7595b8ff60fc6e56ed454939cc"

RPROVIDES:${PN} += "libwlroots-0-19 \
libwlroots-0.19.so"

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
