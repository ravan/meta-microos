SUMMARY = "Tools for QEMU"
DESCRIPTION = "This package contains various QEMU related tools, including a bridge helper, \
a virtfs helper, ivshmem, disk utilities and scripts for various purposes."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-tools-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "1a520771f8325cb9fb796e9a69b7ccaaa3ea581c864b92f5bd2ae0091e7bdf93a795ac2c611014aa4512cd50982cc2664dbc247f829a39d9c7e261e1015d966c"

RPROVIDES:${PN} += "config-qemu-tools \
qemu-tools"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
group-kvm \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libm.so.6 \
libxkbcommon.so.0 \
permissions \
qemu-img \
qemu-pr-helper \
virtiofsd"

inherit rpm
