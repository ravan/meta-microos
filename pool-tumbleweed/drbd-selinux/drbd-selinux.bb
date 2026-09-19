SUMMARY = "SElinux policy for DRBD"
DESCRIPTION = "drbd-selinux contains the SELinux policy meant to be used with this version of DRBD and related tools."
LICENSE = "GPL-2.0-or-later"

PV = "9.29.0"

RPM_NAME = "drbd-selinux-9.29.0-10.7.noarch.rpm"
RPM_HASH = "81a4dde5bc046726224cdd9f0e776953bea288e4e97705f0af3a201a0c1a6eec6357a13bd69cb181c608417a47e7c954d7acdff2230496a5ab9d58dcc5587d9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "drbd-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
policycoreutils \
policycoreutils-python-utils \
selinux-policy"

inherit rpm
