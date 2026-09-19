SUMMARY = "Include Files and Libraries for developing with Btrfs"
DESCRIPTION = "This package contains the libbtrfs.so shared library and limited API to access \
Btrfs filesystems."
LICENSE = "GPL-2.0-only"

PV = "7.1"

RPM_NAME = "libbtrfs-devel-7.1-1.2.aarch64.rpm"
RPM_HASH = "b71497cb837b73f20d5cdd06004b99b0d89176c0f8194686a3fa67995428dbbfc960b3f41fc1fca0c5aafa74cba69746bbf248f976dabf2026851ce4829294f5"

RPROVIDES:${PN} += "libbtrfs-devel"

RDEPENDS:${PN} += "btrfsprogs \
libbtrfs0"

inherit rpm
