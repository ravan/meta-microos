SUMMARY = "Server side daemon & driver required to run QEMU guests"
DESCRIPTION = "Server side daemon and driver required to manage the virtualization \
capabilities of the QEMU emulators \
 \
This package does not contain files, it just requires the necessary packages."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-qemu-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "761c2c8d1430384e5605670cfa6186a6ae4117a3ff0bb12eaeb392004c302cad7c0ba020f0bc3316c24bac8f712cc85d56b9ca0836a953f798882084bf9f563b"

RPROVIDES:${PN} += "libvirt-daemon-qemu"

RDEPENDS:${PN} += "libvirt-daemon-driver-network \
libvirt-daemon-driver-nodedev \
libvirt-daemon-driver-qemu \
libvirt-daemon-driver-secret \
libvirt-daemon-driver-storage \
libvirt-daemon-lock \
libvirt-daemon-log \
libvirt-daemon-plugin-lockd"

inherit rpm
