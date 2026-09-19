SUMMARY = "Server side daemon & driver required to run LXC guests"
DESCRIPTION = "Server side daemon and driver required to manage the virtualization \
capabilities of LXC \
 \
This package does not contain files, it just requires the necessary packages."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-lxc-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "8945381ff1871fbb4df07dfd3d68ba7ff7e04ee2d0cffa1430edf26d3dd9e2d7a4f2d6f2debbb4262e223050ee4f8cf1a05ca4c6692fd041d09c40282047a0d3"

RPROVIDES:${PN} += "libvirt-daemon-lxc"

RDEPENDS:${PN} += "libvirt-daemon-driver-lxc \
libvirt-daemon-driver-network \
libvirt-daemon-driver-nodedev \
libvirt-daemon-driver-secret \
libvirt-daemon-driver-storage \
libvirt-daemon-log"

inherit rpm
