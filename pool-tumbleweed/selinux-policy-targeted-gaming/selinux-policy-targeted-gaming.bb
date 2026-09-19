SUMMARY = "SELinux policy changes for a simplified gaming experience"
DESCRIPTION = "SELinux policy changes for a simplified gaming experience"
LICENSE = "MIT"

PV = "3"

RPM_NAME = "selinux-policy-targeted-gaming-3-1.3.noarch.rpm"
RPM_HASH = "a5f2f19531c07110481fe54794779919fba885e4adade0230ae0f78a7c1a10d144cf493662e94ea3c41b3752bcd8a6088e777fa60b173ef8495183ecb9deea83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "selinux-policy-targeted-gaming"

RDEPENDS:${PN} += "/usr/bin/sh \
policycoreutils-python-utils \
selinux-policy \
selinux-policy-targeted \
selinux-tools"

inherit rpm
