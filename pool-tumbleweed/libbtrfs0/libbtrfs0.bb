SUMMARY = "Library for interacting with Btrfs"
DESCRIPTION = "This package contains the versioned libbtrfs.so shared library."
LICENSE = "GPL-2.0-only"

PV = "7.1"

RPM_NAME = "libbtrfs0-7.1-1.2.aarch64.rpm"
RPM_HASH = "a59aab84c099d4a2cae81d67c84a04ce4b71267b0b95ad051e65c99a74f5ed23c323d01bf704f1d383070b0f88384cd582259dd56d39fdbf1cbefc4fd897d5e7"

RPROVIDES:${PN} += "libbtrfs.so.0 \
libbtrfs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
