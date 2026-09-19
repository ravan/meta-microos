SUMMARY = "Storage driver plugin for disk"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for block \
volumes using the host disks."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-driver-storage-disk-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "e403d3ced036d3cf9f895fcfc5c0ebe388c4db4d2f69df71b2cc86008baf089f9b129504c633ecf13eb6e28423fe158dd4eb93a391b42f23ec950531e95ec2ab"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-disk \
libvirt-storage-backend-disk.so"

RDEPENDS:${PN} += "device-mapper \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libvirt-daemon-driver-storage-core \
libvirt.so.0 \
parted"

inherit rpm
