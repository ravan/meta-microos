SUMMARY = "Development files for the flatpak library"
DESCRIPTION = "flatpak is a system for building, distributing and running sandboxed desktop \
applications on Linux. See https://wiki.gnome.org/Projects/SandboxedApps for \
more information."
LICENSE = "LGPL-2.1-or-later"

PV = "1.18.2"

RPM_NAME = "flatpak-devel-1.18.2-1.1.aarch64.rpm"
RPM_HASH = "64e37ceff59718221dde32b4e0bc520e67d1dfaed9c1011bc6e751adc8241fae9901c9c8dc3964badcfd46e558083e96e0a3f498073f0b0917f08c8c48cd7b52"

RPROVIDES:${PN} += "flatpak-devel \
pkgconfig-flatpak"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
flatpak \
libflatpak0 \
pkgconfig-dconf \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gpgme \
pkgconfig-json-glib-1.0 \
pkgconfig-libarchive \
pkgconfig-libcurl \
pkgconfig-libseccomp \
pkgconfig-libsystemd \
pkgconfig-libxml-2.0 \
pkgconfig-libzstd \
pkgconfig-ostree-1 \
pkgconfig-polkit-agent-1 \
pkgconfig-wayland-client \
pkgconfig-xau \
typelib-1-0-Flatpak-1-0 \
typelib-Flatpak \
typelib-GLib"

inherit rpm
