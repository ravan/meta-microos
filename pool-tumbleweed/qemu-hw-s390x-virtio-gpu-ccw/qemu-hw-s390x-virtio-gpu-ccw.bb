SUMMARY = "S390x virtio-gpu ccw device for QEMU"
DESCRIPTION = "This package contains a module providing the s390x virtio gpu ccw device for \
QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-hw-s390x-virtio-gpu-ccw-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "0534df7c4a65ac31f37c106e582b28de32b5c0e7e05f9464ce85bffd0b326832adac350b99fdb360d80f45155b81b70a3f099b7ae8a92ead1df23aa21c262f71"

RPROVIDES:${PN} += "qemu-hw-s390x-virtio-gpu-ccw"

RDEPENDS:${PN} += "qemu-hw-display-virtio-gpu"

inherit rpm
