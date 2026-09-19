SUMMARY = "Virtio-gpu pci device for QEMU"
DESCRIPTION = "This package contains a module providing the virtio gpu pci device for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-hw-display-virtio-gpu-pci-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "b2c55daaf4421651cdeba2198c3ac143109883ef98a34fc98e64ef69f0f741e3f4670a8feb13da46d563d73059018e2459eb82175c98e07314d681136b7fdd9b"

RPROVIDES:${PN} += "qemu-hw-display-virtio-gpu-pci"

RDEPENDS:${PN} += "qemu-hw-display-virtio-gpu"

inherit rpm
