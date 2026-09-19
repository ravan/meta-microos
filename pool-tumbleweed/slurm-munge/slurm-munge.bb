SUMMARY = "SLURM authentication and crypto implementation using Munge"
DESCRIPTION = "This package contains the SLURM authentication module for Chris Dunlap's Munge."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "slurm-munge-25.11.2-1.6.aarch64.rpm"
RPM_HASH = "d72b364a7a1cce2e799d4eec2dccc5515c0ef04f53d00e1253bbf80c0e152bcc428c0f0a8a0ca4590d797dbe4b3f5f5861d40f7340e93a734aea1d816103e15f"

RPROVIDES:${PN} += "slurm-auth-munge \
slurm-munge"

RDEPENDS:${PN} += "libc.so.6 \
libmunge.so.2 \
munge \
slurm-plugins"

inherit rpm
