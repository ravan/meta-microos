SUMMARY = "Development files for the FLTK GUI toolkit"
DESCRIPTION = "The Fast Light Tool Kit ('FLTK', pronounced 'fulltick') is a C++ \
graphical user interface toolkit for the X Window System, \
OpenGL, and Microsoft Windows NT 4.0, 95, or 98. The \
installation of this package requires a 3D library such as Mesa."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.11"

RPM_NAME = "fltk-devel-1.3.11-1.9.aarch64.rpm"
RPM_HASH = "c8af0fd7a74a628ed5a824db04b52b4e250eb59e71a5985c5ef21c16b5ebf48c137da01506a3470f884fa0d66118ca13e9f4fc981cfc2e6e383ae18d79e6acd6"

RPROVIDES:${PN} += "fltk \
fltk-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libfltk-forms.so.1.3 \
libfltk-images.so.1.3 \
libfltk.so.1.3 \
libfltk1-3 \
libpng16.so.16 \
libstdc++.so.6 \
pkgconfig-gl \
pkgconfig-x11"

inherit rpm
