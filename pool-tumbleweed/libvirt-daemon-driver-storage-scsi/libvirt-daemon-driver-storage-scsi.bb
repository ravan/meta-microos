SUMMARY = "Storage driver plugin for local scsi devices"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for scsi \
host devices."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-driver-storage-scsi-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "7123b135bd20c76fda81c8abdf0fe3db03d66ca8302cc2e1a6cfe7855fdb19bead71dfb08720f66068a6bcbfdf0ea86c1a29c53b7749807be710c1587a507370"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-scsi \
libvirt-storage-backend-scsi.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libvirt-daemon-driver-storage-core \
libvirt-libs \
libvirt.so.0"

inherit rpm
