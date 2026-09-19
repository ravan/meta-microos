SUMMARY = "SLURM plugin for pdsh"
DESCRIPTION = "Plugin for pdsh to determine nodes to run on by SLURM jobs or partitions."
LICENSE = "GPL-2.0-or-later"

PV = "2.36"

RPM_NAME = "pdsh-slurm-2.36-1.2.aarch64.rpm"
RPM_HASH = "cfe3a153b6e5ea0bd5cd1e59df1d5c2aeb36fa6917d4d27d5b69d4513e0204df341e7f3890ea7dcd588aeeef4d360d907d59af7f21c46e1de6ea454e4325a6e5"

RPROVIDES:${PN} += "pdsh-slurm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libslurm.so.44 \
pdsh"

inherit rpm
