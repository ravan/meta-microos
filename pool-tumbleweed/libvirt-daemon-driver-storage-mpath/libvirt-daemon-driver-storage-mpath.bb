SUMMARY = "Storage driver plugin for multipath volumes"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for \
multipath storage using device mapper."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-driver-storage-mpath-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "c68ea37062bcfebfbb76b4c9596744ebd3f126a376059f7c083edc7d2fc236aabe3f0e94cd354c013c8c0c55e20a6859a6f274cb9792f100b521bc870cf0a1a6"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-mpath \
libvirt-storage-backend-mpath.so"

RDEPENDS:${PN} += "device-mapper \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdevmapper.so.1.03 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libvirt-daemon-driver-storage-core \
libvirt-libs \
libvirt.so.0"

inherit rpm
