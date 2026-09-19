SUMMARY = "SELinux targeted base policy"
DESCRIPTION = "SELinux policy targeted base module."
LICENSE = "GPL-2.0-or-later"

PV = "20260910"

RPM_NAME = "selinux-policy-targeted-20260910-1.1.noarch.rpm"
RPM_HASH = "8621497c22373c14ecdb797b920006d573805e26f78f22e0da209ab2aada7e21198ca6a365e184e25ddaf07f3c3d614842fe8e32be37117a68dab0102359207a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-selinux-policy-targeted \
selinux-policy-base \
selinux-policy-targeted"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
selinux-policy"

inherit rpm
