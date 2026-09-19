SUMMARY = "OSTree based application bundle management library"
DESCRIPTION = "flatpak is a system for building, distributing and running sandboxed desktop \
applications on Linux. See https://wiki.gnome.org/Projects/SandboxedApps for \
more information."
LICENSE = "LGPL-2.1-or-later"

PV = "1.18.2"

RPM_NAME = "libflatpak0-1.18.2-1.1.aarch64.rpm"
RPM_HASH = "a08f957dd254922a39bd60477c2c75ba23dd640de3cf983032da6d61809db394c8444359f6d6e2354867c0fce0fe9cf808a1962b427a9a9df8d97e1db1a70dc3"

RPROVIDES:${PN} += "libflatpak.so.0 \
libflatpak0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libXau.so.6 \
libarchive.so.13 \
libc.so.6 \
libcurl.so.4 \
libdconf.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.45 \
libjson-glib-1.0.so.0 \
libostree-1.so.1 \
libpolkit-gobject-1.so.0 \
libseccomp.so.2 \
libsystemd.so.0 \
libwayland-client.so.0 \
libxml2.so.16 \
libzstd.so.1"

inherit rpm
