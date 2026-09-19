SUMMARY = "Modular Wayland compositor library"
DESCRIPTION = "Pluggable, composable modules for building a Wayland compositor."
LICENSE = "MIT"

PV = "0.18.2"

RPM_NAME = "wlroots-0_18-devel-0.18.2-3.3.aarch64.rpm"
RPM_HASH = "754ff492d6ee6a1f8314d478f9f28781aa964019ffddf42df05550fe633a193230237f147aac445ec3c67739fb4dd799036461b1a94c241c497443742d3c709f"

RPROVIDES:${PN} += "pkgconfig-wlroots-0.18 \
wlroots-0-18-devel \
wlroots-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwlroots-0-18 \
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
