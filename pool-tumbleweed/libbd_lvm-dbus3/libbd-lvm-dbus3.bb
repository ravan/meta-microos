SUMMARY = "The LVM plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides LVM-related functionality utilizing the LVM D-Bus API."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_lvm-dbus3-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "473a1f020de059473521c6538ea0c2edd1ce51b8c8b5c969318291137c3478f9a4eb0384163dbd1d8c25780c75c5605f9e608be4091bfdeb2873e1f8b548b622"

RPROVIDES:${PN} += "libbd-lvm-dbus.so.3 \
libbd-lvm-dbus3 \
libblockdev-lvm-dbus"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbd-utils.so.3 \
libbd-utils3 \
libc.so.6 \
libdevmapper.so.1.03 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libyaml-0.so.2 \
lvm2 \
thin-provisioning-tools"

inherit rpm
