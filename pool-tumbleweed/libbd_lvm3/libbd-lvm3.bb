SUMMARY = "The LVM plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides LVM-related functionality."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_lvm3-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "16fd5a063e7a91abdeff5634a5665543e4839b77bd088fc59d3542884e3c11558b2e4b36526111423f9c970d866bef2c02dc336db3eb33ca6dee76a7200108a9"

RPROVIDES:${PN} += "libbd-lvm.so.3 \
libbd-lvm3 \
libblockdev-lvm"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbd-utils.so.3 \
libbd-utils3 \
libc.so.6 \
libdevmapper.so.1.03 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libyaml-0.so.2 \
lvm2 \
thin-provisioning-tools"

inherit rpm
