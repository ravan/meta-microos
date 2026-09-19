SUMMARY = "NSS Plugin for SLURM"
DESCRIPTION = "libnss_slurm is an optional NSS plugin that permits password and group \
resolution for a job on a compute node to be serviced through the local \
slurmstepd process."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "libnss_slurm2-25.11.2-1.6.aarch64.rpm"
RPM_HASH = "62317255149fe7370704ef3b350bc8941eda3566f30b08552e266773819a4e52077eb642d96d5618d55a976db022b2453588d69effc955259ef2b1e8e7eff779"

RPROVIDES:${PN} += "config-libnss-slurm2 \
libnss-slurm.so.2 \
libnss-slurm2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libslurm.so.44"

inherit rpm
