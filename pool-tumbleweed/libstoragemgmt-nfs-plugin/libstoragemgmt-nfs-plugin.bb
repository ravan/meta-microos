SUMMARY = "Files for nfs support for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-nfs-plugin package contains the plugin for nfs based storage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.3"

RPM_NAME = "libstoragemgmt-nfs-plugin-1.10.3-1.3.aarch64.rpm"
RPM_HASH = "a3a6b0869250aa89c60b8a27a23e0d2f5293bda193efd80afb2461eb7a98c406d533bb3fefb1083bb2e0c7d6623f65b39b56541db809f84e6646e10299a0443c"

RPROVIDES:${PN} += "config-libstoragemgmt-nfs-plugin \
libstoragemgmt-nfs-plugin"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstoragemgmt \
python-abi \
python3-libstoragemgmt"

inherit rpm
