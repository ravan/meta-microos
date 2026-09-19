SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "43.3"

RPM_NAME = "libwnck-devel-43.3-2.4.aarch64.rpm"
RPM_HASH = "c89b885396a091966aee6dae8625b973d2a863b2872c9b9456fe6624c9277b5f5015e11836dcedccd720beb8c8dad08145d20c4a2cad1a38b1a51c2f8fe31fdf"

RPROVIDES:${PN} += "libwnck-devel \
libwnck-doc \
pkgconfig-libwnck-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwnck-3-0 \
pkgconfig-cairo \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libstartup-notification-1.0 \
pkgconfig-pango \
pkgconfig-x11 \
pkgconfig-xres \
typelib-1-0-Wnck-3-0"

inherit rpm
