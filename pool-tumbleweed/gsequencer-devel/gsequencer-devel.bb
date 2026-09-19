SUMMARY = "Advanced Gtk+ Sequencer library development files"
DESCRIPTION = "Advanced Gtk+ Sequencer library development files."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "8.4.2"

RPM_NAME = "gsequencer-devel-8.4.2-1.2.aarch64.rpm"
RPM_HASH = "3fc536ac3c3785d3edecc1eb97e290e5dbbc0ef3d6809ff44b499ad85d0db37d45969d4b6e8d891bd81ed435b9d196db4f5cac0f45325b8367e0603d8414f367"

RPROVIDES:${PN} += "gsequencer-devel \
pkgconfig-libags \
pkgconfig-libags-audio \
pkgconfig-libags-gui \
pkgconfig-libgsequencer"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libags8 \
libgsequencer0 \
pkgconfig-alsa \
pkgconfig-cairo \
pkgconfig-fontconfig \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-gthread-2.0 \
pkgconfig-gtk4 \
pkgconfig-jack \
pkgconfig-libags \
pkgconfig-libinstpatch-1.0 \
pkgconfig-libsoup-3.0 \
pkgconfig-libxml-2.0 \
pkgconfig-sndfile \
pkgconfig-uuid"

inherit rpm
