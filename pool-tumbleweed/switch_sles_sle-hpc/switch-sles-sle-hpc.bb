SUMMARY = "Utility to switch between SLES and SLE-HPC on SLE-12"
DESCRIPTION = "This tool is intended for users who are SLES subscribers but would like \
to migrate to the new SLE-HPC subscription."
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "switch_sles_sle-hpc-0.2-4.9.noarch.rpm"
RPM_HASH = "4d0e9dcb12f2263766c7d73fea0819921a211e17f2f86e522884ea60e857a647ee1c636e17122636ad4a3814c31c34e8974b44c4cc284dbd502e7dd31f95e4f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "switch-sles-sle-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
SUSEConnect \
bash \
coreutils \
rpm \
sed \
zypper"

inherit rpm
