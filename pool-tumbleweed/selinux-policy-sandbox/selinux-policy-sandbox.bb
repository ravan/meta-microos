SUMMARY = "SELinux policy sandbox"
DESCRIPTION = "SELinux sandbox policy used for the selinux-sandbox package"
LICENSE = "GPL-2.0-or-later"

PV = "20260910"

RPM_NAME = "selinux-policy-sandbox-20260910-1.1.noarch.rpm"
RPM_HASH = "d19c208fed98b981d7047e6433d9745a1f1bcfee79bdc29c0d7c278487ca8e9b05e4f02472262da632f41bbcb1fb1b7f3c1612d2cac24b169e8c1b1518c954eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "selinux-policy-sandbox"

RDEPENDS:${PN} += "/usr/bin/sh \
selinux-policy-targeted"

inherit rpm
