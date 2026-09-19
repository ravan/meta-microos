SUMMARY = "SLURM database daemon"
DESCRIPTION = "The SLURM database daemon provides accounting of jobs in a database."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "slurm-slurmdbd-25.11.2-1.6.aarch64.rpm"
RPM_HASH = "877a8e294ecc4bd1499226473a50952d59af7292a8f46084c47e156fe13cada9e7051dff7dc348f4520cde43a60b18184bbebdebb5628eb0c3d6bd832e582554"

RPROVIDES:${PN} += "config-slurm-slurmdbd \
slurm-slurmdbd"

RDEPENDS:${PN} += "/usr/bin/sh \
group-slurm \
libc.so.6 \
libslurmfull.so \
slurm-config \
slurm-plugins \
slurm-sql \
user-slurm"

inherit rpm
