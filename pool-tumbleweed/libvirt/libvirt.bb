SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "Libvirt is a C toolkit to interact with the virtualization capabilities \
of recent versions of Linux (and other OSes). \
 \
This package does not contain files, it just requires the necessary packages."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "b40e09d76c2bec3362ee88e54ba3e6088bd480ed393cd345c7c2f2214eb165d9b7a4db000413e5f80a31681bf6d1e916acc1562e8573e95fa20cafc134cf4762"

RPROVIDES:${PN} += "libvirt"

RDEPENDS:${PN} += "libvirt-client \
libvirt-client-qemu \
libvirt-daemon \
libvirt-daemon-config-network \
libvirt-daemon-driver-network \
libvirt-daemon-driver-nodedev \
libvirt-daemon-driver-qemu \
libvirt-daemon-driver-secret \
libvirt-daemon-driver-storage \
libvirt-libs"

inherit rpm
