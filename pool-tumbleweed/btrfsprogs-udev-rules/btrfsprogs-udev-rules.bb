SUMMARY = "Udev rules for configuring btrfs file systems"
DESCRIPTION = "This package contains the udev rule file for configuring device mapper \
devices that are components of Btrfs filesystems.  It is meant to be \
used with versions of udev that contain the 'built-in' btrfs command \
(v190 and newer).  Older versions of udev will call the version of \
'btrfs ready' contained in the btrfsprogs package, which does the right \
thing."
LICENSE = "GPL-2.0-only"

PV = "7.1"

RPM_NAME = "btrfsprogs-udev-rules-7.1-1.2.noarch.rpm"
RPM_HASH = "61257ef4c7e20bc5cfa77fa22299e1846e25ab903ee192f06fb63e0bc3f568ee9020e6415291f7144b585058b1cf77b29c8a6b7148d625a7c4442b10912d7f40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "btrfsprogs-udev-rules"

RDEPENDS:${PN} += ""

inherit rpm
