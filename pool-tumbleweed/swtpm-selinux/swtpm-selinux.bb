SUMMARY = "SELinux module for the Software TPM emulator"
DESCRIPTION = "This package provides the SELinux module for the Software TPM emulator."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "swtpm-selinux-0.10.2-1.1.noarch.rpm"
RPM_HASH = "c0ad1c359e1dfc98a944450c2fe008f5037fad4693f61a3ae59aadf02c815b0a97a48489c0fd5a14d244405853553de373767fecf7a6559896fff291c943a480"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swtpm-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
libselinux-utils \
policycoreutils \
policycoreutils-python-utils \
selinux-policy \
selinux-policy-base \
swtpm"

inherit rpm
