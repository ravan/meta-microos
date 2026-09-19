SUMMARY = "iSCSI block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over an \
iSCSI network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-block-iscsi-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "ad853f9e3a7825c7dc947d0e75b094b49e1c5d2bdee17f2bbfdcc95298124462755fd6256835392088daaabaed97c7d1fafcdc4abb231ef5919a3b49aba91cab"

RPROVIDES:${PN} += "qemu-block-iscsi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiscsi.so.11"

inherit rpm
