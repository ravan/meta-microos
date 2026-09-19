SUMMARY = "Modular Wayland compositor library"
DESCRIPTION = "Pluggable, composable modules for building a Wayland compositor."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "wlroots-0_17-devel-0.17.3-2.6.aarch64.rpm"
RPM_HASH = "286e7a75ee980bc5522112b20358b4bde2f220ca3102b9bdcabee1876b94bd24dd1640464fc4c7a8ed3b45c4902f63872ff7a69299f515a5ba417bee40032ad3"

RPROVIDES:${PN} += "pkgconfig-wlroots \
wlroots-0-17-devel \
wlroots-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwlroots12 \
pkgconfig-egl \
pkgconfig-gbm \
pkgconfig-glesv2 \
pkgconfig-libdisplay-info \
pkgconfig-libdrm \
pkgconfig-libinput \
pkgconfig-libseat \
pkgconfig-libudev \
pkgconfig-pixman-1 \
pkgconfig-vulkan \
pkgconfig-wayland-client \
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
