SUMMARY = "Python 3 libraries for Ceph distributed file system"
DESCRIPTION = "This package contains Python 3 libraries for interacting with Ceph distributed \
file system."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "python3-cephfs-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "4bc48fe2edc048cd2ed977fefbaca71a6d3c249a21cdfe81fbcc28447f265f372dee93f8bb4df4d5d94bbca89e15db0ad08468dec43bb821ac3997e8bd7caff3"

RPROVIDES:${PN} += "python-cephfs \
python3-cephfs \
python3.13dist-cephfs \
python3dist-cephfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcephfs.so.2 \
libcephfs2 \
python-abi \
python3-ceph-argparse \
python3-rados"

inherit rpm
