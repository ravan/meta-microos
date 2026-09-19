SUMMARY = "Busybox applets replacing policycoreutils"
DESCRIPTION = "This package contains the symlinks to provide policycoreutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-policycoreutils-1.38.0-42.2.noarch.rpm"
RPM_HASH = "e8be394a570e3a51372a0ec2aa364cf1922790d6fe6733ee4985c52292449fe89af25c141208c61bd13786d033d118bc8a223691470b6a2c67a7b84f473d38fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-policycoreutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
