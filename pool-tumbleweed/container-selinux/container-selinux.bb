SUMMARY = "SELinux policies for container runtimes"
DESCRIPTION = "SELinux policy modules for use with container runtimes."
LICENSE = "GPL-2.0-only"

PV = "2.251.0"

RPM_NAME = "container-selinux-2.251.0-1.1.noarch.rpm"
RPM_HASH = "22caaae1e41d73b2e7a1bba032373fbf163ca1faf8a1ca4ed2e67cc0cdc35e88cc4454538a9fd47b90b81105990162f3787f791c0cb4c78734a4893a3a2e768b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "container-selinux"

RDEPENDS:${PN} += "/usr/bin/sed \
/usr/bin/sh \
policycoreutils \
selinux-policy \
selinux-policy-base \
selinux-policy-targeted \
selinux-tools"

inherit rpm
