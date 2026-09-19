SUMMARY = "DMG block support for QEMU"
DESCRIPTION = "This package contains a module for accessing Mac OS X image files from \
qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-block-dmg-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "6ed5a2d095b0695c491b5661757af4e9004e7f8d70d24cac1c135bcf28d96947994f69de265225d4a6e1da605e0de393b9db6e72f3dda3a25b12f55dc5309646"

RPROVIDES:${PN} += "qemu-block-dmg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzfse.so"

inherit rpm
