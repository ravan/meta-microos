SUMMARY = "Slurm REST API Interface"
DESCRIPTION = "This package provides the interface to SLURM via REST API."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "slurm-rest-25.11.2-1.6.aarch64.rpm"
RPM_HASH = "f0670cc0753eb5ef85ff3227c8067b89a4114aed11df0cd430a6deac1ffc00f72725399227cf01f9ca5d15cc87ed4c44bca9d9406d4c2d3e3f5a615f98696399"

RPROVIDES:${PN} += "slurm-rest"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libslurmfull.so \
slurm-config"

inherit rpm
