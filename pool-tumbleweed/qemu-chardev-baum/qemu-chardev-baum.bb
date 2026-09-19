SUMMARY = "Baum braille chardev support for QEMU"
DESCRIPTION = "This package contains a module for baum braille chardev support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-chardev-baum-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "f2c4c312a4e0884cc18df5f973340af29173a7227bc14e0c2bdb9c6607523fe877bed68dffa41845005d8312d7ec3335c4964f44aa3eb278779ea63a940c27b2"

RPROVIDES:${PN} += "qemu-chardev-baum"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6"

inherit rpm
