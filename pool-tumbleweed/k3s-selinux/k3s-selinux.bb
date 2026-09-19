SUMMARY = "SELinux policy module for k3s"
DESCRIPTION = "This package installs and sets up the SELinux policy security module for k3s."
LICENSE = "Apache-2.0"

PV = "1.6.stable.1"

RPM_NAME = "k3s-selinux-1.6.stable.1-1.9.noarch.rpm"
RPM_HASH = "6b77b4031ab6b3f242d8f97c2f43f05608ea7eb19d2cb7d7c2b69627eeef23aabb01eba69383c38df8817d1cce3df19287f131d1935406381ffb4ec65126e1c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "k3s-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
container-selinux \
policycoreutils \
selinux-policy-base \
selinux-tools"

inherit rpm
