SUMMARY = "Development files for the VTE terminal emulator library"
DESCRIPTION = "VTE is a terminal emulator library that provides a terminal widget for \
use with GTK+ as well as handling of child process and terminal \
emulation settings. \
 \
This package contains the files needed for building applications using \
VTE."
LICENSE = "LGPL-2.0-only"

PV = "0.84.1"

RPM_NAME = "vte-devel-0.84.1-1.2.aarch64.rpm"
RPM_HASH = "a3f57f27d37bf9794d8619f370f33f16198bc1d07202ceccf1ccce456a1e9e5ed1222d5dd6b10ff1351748434b0a40abc1fc925064be427c35f4b2d28cff289c"

RPROVIDES:${PN} += "pkgconfig-vte-2.91 \
pkgconfig-vte-2.91-gtk4 \
vte-devel \
vte-doc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvte-2-91-0 \
pkgconfig-cairo \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-gtk4 \
pkgconfig-pango \
typelib-1-0-Vte-2-91 \
typelib-1-0-Vte-3-91"

inherit rpm
