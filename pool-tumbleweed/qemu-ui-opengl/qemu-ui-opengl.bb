SUMMARY = "OpenGL based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing OpenGL based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-ui-opengl-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "340918691e88fd9f98fc241fb8ad0b0356156b5696fc7af591469afd0d22b248ac06f8acb4e41241ed07086ecc108b4c44be14d33a1ba8208e620bd84c87283b"

RPROVIDES:${PN} += "qemu-ui-opengl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libepoxy.so.0 \
libgbm.so.1 \
libpixman-1.so.0"

inherit rpm
