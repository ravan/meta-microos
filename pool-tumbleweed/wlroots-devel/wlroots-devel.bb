SUMMARY = "Modular Wayland compositor library"
DESCRIPTION = "Pluggable, composable modules for building a Wayland compositor."
LICENSE = "MIT"

PV = "0.20.2"

RPM_NAME = "wlroots-devel-0.20.2-1.2.aarch64.rpm"
RPM_HASH = "0b137d21b07bce98cf173ae86cf671f4180f5970894c3e920acfdd4f4073947317e271903b487de2196b910831c0adc5c99189cf6513ad082c0f3bb1a28016d5"

RPROVIDES:${PN} += "pkgconfig-wlroots-0.20 \
wlroots-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwlroots-0-20 \
pkgconfig-egl \
pkgconfig-gbm \
pkgconfig-glesv2 \
pkgconfig-lcms2 \
pkgconfig-libdisplay-info \
pkgconfig-libdrm \
pkgconfig-libinput \
pkgconfig-libliftoff \
pkgconfig-libseat \
pkgconfig-libudev \
pkgconfig-pixman-1 \
pkgconfig-vulkan \
pkgconfig-wayland-client \
pkgconfig-wayland-protocols \
pkgconfig-wayland-server \
pkgconfig-xcb \
pkgconfig-xcb-composite \
pkgconfig-xcb-dri3 \
pkgconfig-xcb-errors \
pkgconfig-xcb-ewmh \
pkgconfig-xcb-icccm \
pkgconfig-xcb-present \
pkgconfig-xcb-render \
pkgconfig-xcb-renderutil \
pkgconfig-xcb-res \
pkgconfig-xcb-shm \
pkgconfig-xcb-xfixes \
pkgconfig-xcb-xinput \
pkgconfig-xkbcommon"

inherit rpm
