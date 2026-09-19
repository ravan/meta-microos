SUMMARY = "SELinux policy module for rke2"
DESCRIPTION = "This package installs and sets up the SELinux policy security module for rke2."
LICENSE = "Apache-2.0"

PV = "0.23.stable.1"

RPM_NAME = "rke2-selinux-0.23.stable.1-1.3.noarch.rpm"
RPM_HASH = "983d71f0c790ae35c11be5a795d8a3fb510f174fe54bc09f42082652dfd2524dcebf51698231602247377e1a11088ecc4466d201da7e19ae4e1890bbf4d097d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rke2-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
container-selinux \
policycoreutils \
selinux-policy-base \
selinux-tools"

inherit rpm
