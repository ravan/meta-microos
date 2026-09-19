SUMMARY = "Storage driver plugin including base backends for the virstoraged daemon"
DESCRIPTION = "The storage driver plugin for the virtstoraged daemon, providing \
an implementation of the storage APIs using files, local disks, LVM, SCSI, \
iSCSI, and multipath storage."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-driver-storage-core-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "480e0e3d034315a3a05a9e43d3aef7dbd51624e6e6d9138e9c2a7c656fd87f1323483047283ff3818bd37e56645c7d87f8d70663d350ad81aaf120220d046189"

RPROVIDES:${PN} += "config-libvirt-daemon-driver-storage-core \
libvirt-daemon-driver-storage-core \
libvirt-driver-storage.so \
libvirt-storage-backend-fs.so"

RDEPENDS:${PN} += "/usr/bin/qemu-img \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libparted.so.2 \
libselinux.so.1 \
libtirpc.so.3 \
libvirt-daemon-common \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0 \
libxml2.so.16 \
util-linux"

inherit rpm
