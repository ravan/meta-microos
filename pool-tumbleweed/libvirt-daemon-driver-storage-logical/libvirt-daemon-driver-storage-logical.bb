SUMMARY = "Storage driver plugin for lvm volumes"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for block \
volumes using lvm."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-driver-storage-logical-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "39ac8df975abfc312d900b813d433fab087d32c5fcdd2c28582a1c6ef04d305076626dfa10e1d1469e6efddd818c386ab73919a5c82cd230ee5c600629705f9e"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-logical \
libvirt-storage-backend-logical.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libvirt-daemon-driver-storage-core \
libvirt-libs \
libvirt.so.0 \
lvm2"

inherit rpm
