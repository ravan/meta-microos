SUMMARY = "SELinux policy devel"
DESCRIPTION = "SELinux policy development package"
LICENSE = "GPL-2.0-or-later"

PV = "20260910"

RPM_NAME = "selinux-policy-devel-20260910-1.1.noarch.rpm"
RPM_HASH = "cc3cfcf08cf971e585170f52ed8fdd406714e465a735165233344cf360697e3b3620da60ecfc4d87f33ed7231402715241881e4ad6887ff81166c8b3581b10f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "selinux-policy-devel"

RDEPENDS:${PN} += "/usr/bin/make \
/usr/bin/sh \
checkpolicy \
m4 \
policycoreutils-devel \
selinux-policy"

inherit rpm
