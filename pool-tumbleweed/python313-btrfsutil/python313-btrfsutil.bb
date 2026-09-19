SUMMARY = "Python bindings for developing with libbtrfsutil"
DESCRIPTION = "This package contains the python bindings to build applications to interface \
with Btrfs using libbtrfsutil."
LICENSE = "GPL-2.0-only"

PV = "7.1"

RPM_NAME = "python313-btrfsutil-7.1-1.2.aarch64.rpm"
RPM_HASH = "d66adb47460fefb82af9886d440e40ac00d0a9bf580cb54f8aa66e89a0ed2ba40ecf9a524231c2ec434dace8797e1f5a7383c58623570209bc7048ba83027d50"

RPROVIDES:${PN} += "python3-btrfsutil \
python3.13dist-btrfsutil \
python313-btrfsutil \
python3dist-btrfsutil"

RDEPENDS:${PN} += "btrfsprogs \
ld-linux-aarch64.so.1 \
libbtrfsutil.so.1 \
libbtrfsutil1 \
libc.so.6 \
python-abi \
python3"

inherit rpm
