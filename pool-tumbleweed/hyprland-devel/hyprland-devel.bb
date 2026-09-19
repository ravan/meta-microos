SUMMARY = "Files required to build Hyprland plugins"
DESCRIPTION = "This package contains the neccessary files that are required to \
build plugins for hyprland."
LICENSE = "BSD-3-Clause"

PV = "0.56.2"

RPM_NAME = "hyprland-devel-0.56.2-1.2.noarch.rpm"
RPM_HASH = "11a0f822d442311eb78b6ea5a6f7680f68dff5f5e5a010f90f5f06c0d80238bb8a4f321fc23592cd32fe71f49db8f4e0cd59da1e77c96e3954f29678f852074b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hyprland-devel \
pkgconfig-hyprland"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-libGLESv2-devel \
Mesa-libGLESv3-devel \
hyprland \
pkgconfig-aquamarine \
pkgconfig-cairo \
pkgconfig-egl \
pkgconfig-hyprcursor \
pkgconfig-hyprgraphics \
pkgconfig-hyprlang \
pkgconfig-hyprutils \
pkgconfig-libdrm \
pkgconfig-libinput \
pkgconfig-wayland-server \
pkgconfig-xcb \
pkgconfig-xcb-composite \
pkgconfig-xcb-errors \
pkgconfig-xcb-icccm \
pkgconfig-xcb-render \
pkgconfig-xcb-res \
pkgconfig-xcb-xfixes \
pkgconfig-xkbcommon"

inherit rpm
