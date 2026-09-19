SUMMARY = "Python bindings for developing with libbtrfsutil"
DESCRIPTION = "This package contains the python bindings to build applications to interface \
with Btrfs using libbtrfsutil."
LICENSE = "GPL-2.0-only"

PV = "7.1"

RPM_NAME = "python314-btrfsutil-7.1-1.2.aarch64.rpm"
RPM_HASH = "6150f54c6f12ec80e0d03174784f9e4650b051977878bd68f37d35ef09d3802d00226446859d14bde3214b92a94a770f5bffb427fe9876e62691d5e4b50ea6a0"

RPROVIDES:${PN} += "python3.14dist-btrfsutil \
python314-btrfsutil \
python3dist-btrfsutil"

RDEPENDS:${PN} += "btrfsprogs \
ld-linux-aarch64.so.1 \
libbtrfsutil.so.1 \
libbtrfsutil1 \
libc.so.6 \
python-abi \
python3"

inherit rpm
