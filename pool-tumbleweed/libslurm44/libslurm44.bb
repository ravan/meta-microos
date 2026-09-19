SUMMARY = "Libraries for SLURM"
DESCRIPTION = "This package contains the library needed to run programs dynamically linked \
with SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "libslurm44-25.11.2-1.6.aarch64.rpm"
RPM_HASH = "07ef0767595967c94e5b1254f2d61ea09b68dba53749db095902bf57489f2220344f0fe7bf90565b16b9a97e642184cc537a5f48bb7d0e4141fa647c5a8e7b6d"

RPROVIDES:${PN} += "libslurm \
libslurm.so.44 \
libslurm44"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6 \
libresolv.so.2 \
slurm-config"

inherit rpm
