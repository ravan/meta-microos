SUMMARY = "Virtio vga device for QEMU"
DESCRIPTION = "This package contains a module providing the virtio vga device for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-hw-display-virtio-vga-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "2d2433aef6f06be95d5b0bfb2d59490334e789df532b05588b96d8d99776cc8fd71e87508dc03c7a1f0456c89fcba1b322691cba9f3f1321c1201de3c54a46ba"

RPROVIDES:${PN} += "qemu-hw-display-virtio-vga"

RDEPENDS:${PN} += ""

inherit rpm
