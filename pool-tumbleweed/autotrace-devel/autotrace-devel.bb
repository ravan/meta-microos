SUMMARY = "Library for converting bitmaps to vector graphics"
DESCRIPTION = "AutoTrace is a program for converting bitmaps to vector graphics. The \
aim of the AutoTrace project is the development of a freely-available \
application similar to CorelTrace or Adobe Streamline. In some aspects, \
it is already better. Originally created as a plug-in for the GIMP, \
AutoTrace is now a stand-alone program and can be compiled on any UNIX \
platform using GCC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.31.10"

RPM_NAME = "autotrace-devel-0.31.10-1.7.aarch64.rpm"
RPM_HASH = "9e82b4031e3692e959a975fdf49873dde8f511758f0ee9210e066a3d375de549c154a2721f286eacf10889c146c82f3b8e8a05ca9525c0c4aa8e426c967c0bc6"

RPROVIDES:${PN} += "autotrace-devel \
pkgconfig-autotrace"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libautotrace3 \
pkgconfig \
pkgconfig-ImageMagick \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-pstoedit"

inherit rpm
