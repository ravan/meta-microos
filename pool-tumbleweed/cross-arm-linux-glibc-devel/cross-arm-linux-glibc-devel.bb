SUMMARY = "Linux headers for arm userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for arm, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "7.2"

RPM_NAME = "cross-arm-linux-glibc-devel-7.2-2.1.noarch.rpm"
RPM_HASH = "588424d8dc0965ad724c045ff677be8baa3992fedd03b9b03635db8c4cf2e8b4fed27516da01af2c40f3451e70c13181ab44fd565d87bc46551c3404bc33f4c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-arm-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
