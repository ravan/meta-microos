SUMMARY = "cURL block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over \
a network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-block-curl-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "c51387884fb39da92600007c41239e2a9810a3d8efc2f226c75eba49b1c7c1b90f027566f2f97d4d73bd62e53d6cda2ef68207b2240ee5e4fc4b2a5ea654b9c6"

RPROVIDES:${PN} += "qemu-block-curl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4"

inherit rpm
