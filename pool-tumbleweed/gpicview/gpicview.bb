SUMMARY = "LXDE Photo Viewer"
DESCRIPTION = "An extremely fast, lightweight, yet feature-rich photo viewer. \
This software is part of the LXDE Desktop Environment."
LICENSE = "GPL-2.0-only"

PV = "0.2.5"

RPM_NAME = "gpicview-0.2.5-3.11.aarch64.rpm"
RPM_HASH = "fd43bef98239f66fbdd3ec8a193ee7bf838619a0a3f2ad185320f9b589b5e98d0f43497bb3ae33a45be829d1e2d09f9645e5d2d0debe02a5657b3c3a17132e7e"

RPROVIDES:${PN} += "gpicview"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjpeg.so.8 \
libm.so.6"

inherit rpm
