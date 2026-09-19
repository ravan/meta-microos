SUMMARY = "Modular Wayland compositor library"
DESCRIPTION = "Pluggable, composable modules for building a Wayland compositor."
LICENSE = "MIT"

PV = "0.19.3"

RPM_NAME = "wlroots-0_19-devel-0.19.3-1.5.aarch64.rpm"
RPM_HASH = "d99f6529f99b6024552776dc652091471f711850d44dc169c394f75cb55f418ecc798c20ca181aa166f992ff4aabca71e85a88c00c5d44d7042b8f3bfd184530"

RPROVIDES:${PN} += "pkgconfig-wlroots-0.19 \
wlroots-0-19-devel \
wlroots-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwlroots-0-19 \
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
