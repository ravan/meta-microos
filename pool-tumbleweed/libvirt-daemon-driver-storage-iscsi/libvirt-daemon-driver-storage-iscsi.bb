SUMMARY = "Storage driver plugin for iscsi"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for iscsi \
volumes using the host iscsi stack."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-driver-storage-iscsi-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "cd59f6784bbf86ecc2ccab3c47054686ddeb2862217dd29ccfa1ced44e31fe3ddfc7569cc7b93a5e16485e7bd41655101d73ef0cb6ee71b035e953d3fe6dffe5"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-iscsi \
libvirt-storage-backend-iscsi.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libvirt-daemon-driver-storage-core \
libvirt-libs \
libvirt.so.0 \
open-iscsi"

inherit rpm
