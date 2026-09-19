SUMMARY = "Virtio GPU display support for QEMU"
DESCRIPTION = "This package contains a module for Virtio GPU display support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-hw-display-virtio-gpu-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "6834957df675cfc3957de710c2fc60f6baba74b9803068f6240f0b52b7e59e12785bc6e49ea639c418209b8854902d8e8ca4744dc49bd296fc64358550e7e065"

RPROVIDES:${PN} += "qemu-hw-display-virtio-gpu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpixman-1.so.0 \
libvirglrenderer.so.1 \
qemu-hw-display-virtio-vga"

inherit rpm
