SUMMARY = "SLURM auth NULL implementation (no authentication)"
DESCRIPTION = "This package cobtains the SLURM NULL authentication module."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "slurm-auth-none-25.11.2-1.6.aarch64.rpm"
RPM_HASH = "8fe7285786faedc73706619298bffacc540a184c9dd13d69cbec4f44ace915c3dbdeee7d7cddc9a8e3ad344a49bd320a4b1dfe7e8c42fa18bde6bce501138015"

RPROVIDES:${PN} += "slurm-auth-none"

RDEPENDS:${PN} += "libc.so.6 \
slurm"

inherit rpm
