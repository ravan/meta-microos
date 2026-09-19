SUMMARY = "Wrappers for transitition from OpenLava/LSF to Slurm"
DESCRIPTION = "Wrapper scripts for aiding migration from OpenLava/LSF to Slurm"
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "slurm-openlava-25.11.2-1.6.noarch.rpm"
RPM_HASH = "a0d23afbbd8b6f7677c8f02c86c2d9a45363fe897fa6563a3f6e59d1aa6d17935bd4b3c92bd234ec9412a74b25f5274f1858a102c0800d8a4a729cc7a2b77733"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-openlava"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-slurm"

inherit rpm
