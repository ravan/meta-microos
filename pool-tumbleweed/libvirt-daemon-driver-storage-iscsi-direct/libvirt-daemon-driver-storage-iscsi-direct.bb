SUMMARY = "Storage driver plugin for iscsi-direct"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for iscsi \
volumes using libiscsi direct connection."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-driver-storage-iscsi-direct-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "657c61354451ea9acc9fe727efcf76fa7aeaea4b56bfd372b0f73a770832ad389ddc04b48fee239aa128de3741a8c1c772b46ad4dff593b079f7218f84e48d96"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-iscsi-direct \
libvirt-storage-backend-iscsi-direct.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libiscsi.so.11 \
libvirt-daemon-driver-storage-core \
libvirt-libs \
libvirt.so.0"

inherit rpm
