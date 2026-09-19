SUMMARY = "OSTree based application bundles management"
DESCRIPTION = "flatpak is a system for building, distributing and running sandboxed desktop \
applications on Linux. See https://wiki.gnome.org/Projects/SandboxedApps for \
more information."
LICENSE = "LGPL-2.1-or-later"

PV = "1.18.2"

RPM_NAME = "flatpak-1.18.2-1.1.aarch64.rpm"
RPM_HASH = "982b15a14ba8f61ed1abb2596d68da4f3066026714fa2efb8543c24a5e7059ec1b0f130e7ffe46daeea387c7c617408bec48c6ba749ccd12a94cc874e776b928"

RPROVIDES:${PN} += "config-flatpak \
flatpak \
xdg-app"

RDEPENDS:${PN} += "/usr/bin/sh \
bubblewrap \
ld-linux-aarch64.so.1 \
libXau.so.6 \
libappstream.so.5 \
libarchive.so.13 \
libc.so.6 \
libcurl.so.4 \
libdconf.so.1 \
libflatpak0 \
libfuse3.so.4 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.45 \
libjson-glib-1.0.so.0 \
libostree-1.so.1 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0 \
libseccomp.so.2 \
libsystemd.so.0 \
libwayland-client.so.0 \
libxml2.so.16 \
libzstd.so.1 \
ostree \
user-flatpak \
xdg-dbus-proxy \
xdg-desktop-portal"

inherit rpm
