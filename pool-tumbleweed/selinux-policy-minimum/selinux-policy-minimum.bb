SUMMARY = "SELinux minimum base policy"
DESCRIPTION = "SELinux policy minimum base module."
LICENSE = "GPL-2.0-or-later"

PV = "20260910"

RPM_NAME = "selinux-policy-minimum-20260910-1.1.noarch.rpm"
RPM_HASH = "ff2795af5769eb878326e6a4611c958436bffce75a05b229633752a013ea2817408bb4d3b8f3c4bcc8f4cf250552aeb8999b90587e10a958a48471631856906e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-selinux-policy-minimum \
selinux-policy-base \
selinux-policy-minimum"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/sh \
coreutils \
policycoreutils \
policycoreutils-python-utils \
selinux-policy"

inherit rpm
