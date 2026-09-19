SUMMARY = "SDL3 Library Developer Files"
DESCRIPTION = "This package contains files needed for development with the SDL \
library."
LICENSE = "Zlib"

PV = "3.4.16"

RPM_NAME = "SDL3-devel-3.4.16-1.1.aarch64.rpm"
RPM_HASH = "52fd242b367e3336bc7993cd0ed575c4072466a1f9863bfaf386a6d467850f3032889bfedd8ae76a5d8cc3d48262fe0cf7defe7d61153d7366f569c17301391e"

RPROVIDES:${PN} += "SDL3-devel \
cmake-SDL3 \
pkgconfig-sdl3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL3-0 \
pkgconfig-alsa \
pkgconfig-egl \
pkgconfig-gbm \
pkgconfig-gl \
pkgconfig-glesv1-cm \
pkgconfig-glesv2 \
pkgconfig-glu \
pkgconfig-libdecor-0 \
pkgconfig-libdrm \
pkgconfig-libpipewire-0.3 \
pkgconfig-libpulse \
pkgconfig-wayland-client \
pkgconfig-wayland-cursor \
pkgconfig-wayland-egl \
pkgconfig-x11 \
pkgconfig-xcursor \
pkgconfig-xext \
pkgconfig-xfixes \
pkgconfig-xi \
pkgconfig-xkbcommon \
pkgconfig-xrandr \
pkgconfig-xscrnsaver \
pkgconfig-xtst"

inherit rpm
