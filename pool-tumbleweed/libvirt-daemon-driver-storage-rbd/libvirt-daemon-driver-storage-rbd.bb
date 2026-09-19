SUMMARY = "Storage driver plugin for rbd"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for rbd \
volumes using the ceph protocol."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-driver-storage-rbd-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "c779d4bb9c3c220e6f9b3cdfc0bfb56c222750518d77cc4acf7a68bf1d12d95a8b6dc88c4666dbeaa82c3d3fcad0db60b1a1db66809d964819c47e116c06920d"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-rbd \
libvirt-storage-backend-rbd.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
librados.so.2 \
librbd.so.1 \
libvirt-daemon-driver-storage-core \
libvirt-libs \
libvirt.so.0"

inherit rpm
