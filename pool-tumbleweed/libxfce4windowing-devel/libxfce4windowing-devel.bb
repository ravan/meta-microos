SUMMARY = "Development files for libxfce4windowing"
DESCRIPTION = "Libxfce4windowing is an abstraction library that attempts to present windowing \
concepts (screens, toplevel windows, workspaces, etc.) in a \
windowing-system-independent manner. \
 \
Currently, X11 is fully supported, via libwnck. Wayland is partially supported, \
through various Wayland protocol extensions. However, the full range of \
operations available on X11 is not available on Wayland, due to missing \
features in these protocol extensions."
LICENSE = "LGPL-2.1-or-later"

PV = "4.20.7"

RPM_NAME = "libxfce4windowing-devel-4.20.7-1.1.aarch64.rpm"
RPM_HASH = "4f87bf81d423b189be0c04af9504840dd4ec0aee8d59e14483068209ee9fe98544d514952848943135d2b3e5c2c81df8abe6eca2614eac136abb97cd306242e3"

RPROVIDES:${PN} += "libxfce4windowing-devel \
pkgconfig-libxfce4windowing-0 \
pkgconfig-libxfce4windowing-x11-0 \
pkgconfig-libxfce4windowingui-0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxfce4windowing-0-0 \
libxfce4windowingui-0-0 \
pkgconfig-gdk-wayland-3.0 \
pkgconfig-gdk-x11-3.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libdisplay-info \
pkgconfig-libwnck-3.0 \
pkgconfig-libxfce4windowing-0 \
pkgconfig-wayland-client \
pkgconfig-x11 \
pkgconfig-xrandr \
typelib-1-0-Libxfce4windowing-0-0 \
typelib-1-0-Libxfce4windowingui-0-0"

inherit rpm
