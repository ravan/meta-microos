SUMMARY = "Utility library for interacting with Btrfs"
DESCRIPTION = "This package contains the versioned libbtrfsutil.so shared library. This library is \
LGPL unlike libbtrfs.so and can be used by applications to interact with Btrfs \
filesystems."
LICENSE = "GPL-2.0-only"

PV = "7.1"

RPM_NAME = "libbtrfsutil1-7.1-1.2.aarch64.rpm"
RPM_HASH = "6537e4d9076e2788a7aeec85cc2a92de29e00890172f9e1e00668861439a8a3a2b0571f71820fc206268c0eb3afc4c28457c40536a5490d428a9dba17ebab054"

RPROVIDES:${PN} += "libbtrfsutil.so.1 \
libbtrfsutil1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
