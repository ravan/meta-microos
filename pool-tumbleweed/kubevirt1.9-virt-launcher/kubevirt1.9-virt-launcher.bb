SUMMARY = "Launcher component for kubevirt"
DESCRIPTION = "The virt-launcher package provides a launcher for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "kubevirt1.9-virt-launcher-1.9.0-3.1.aarch64.rpm"
RPM_HASH = "7c2a2ac0fbb819f385386efaa7af604e5ebe1044c525d90979fce6d85a5e1dc8f18ded020a0297a3a8275ed57419c7c5f2e7579173e8ff2424a097370b009c6b"

RPROVIDES:${PN} += "kubevirt-virt-launcher \
kubevirt1.9-virt-launcher"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6 \
libnbd.so.0 \
libvirt-admin.so.0 \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm
