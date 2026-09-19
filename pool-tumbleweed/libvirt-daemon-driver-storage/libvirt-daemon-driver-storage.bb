SUMMARY = "Storage daemon and driver plugin including all backends"
DESCRIPTION = "The storage daemon and driver plugin, providing an implementation of the \
storage APIs using LVM, iSCSI, parted and more. \
 \
This package does not contain files, it just requires the necessary packages."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-driver-storage-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "a99f537733d8047a7ee7d94a7dfc7185ff6a9f6f8ed87ee210bd8b0438ab53e57f22b5250f9db2496712aeab2c253f41d3871fdca7c5a32e4f3a60cbc808446b"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage"

RDEPENDS:${PN} += "libvirt-daemon-driver-storage-core \
libvirt-daemon-driver-storage-disk \
libvirt-daemon-driver-storage-iscsi \
libvirt-daemon-driver-storage-iscsi-direct \
libvirt-daemon-driver-storage-logical \
libvirt-daemon-driver-storage-mpath \
libvirt-daemon-driver-storage-rbd \
libvirt-daemon-driver-storage-scsi"

inherit rpm
