SUMMARY = "Perl API to SLURM"
DESCRIPTION = "This package includes the Perl API to provide an interface to SLURM \
through Perl."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "perl-slurm-25.11.2-1.6.aarch64.rpm"
RPM_HASH = "83c9d6f1c61205bd1773ba955814dd199d7f1b2de2ee26d84f1f18e6b2c055571acc4e141b8743571c2646235e5c52805ed0c30874ce110ead89bbda6f1c3aa9"

RPROVIDES:${PN} += "perl-Slurm \
perl-Slurm--Bitstr \
perl-Slurm--Constant \
perl-Slurm--Hostlist \
perl-Slurmdb \
perl-slurm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libslurm.so.44 \
perl \
perl--MODULE-COMPAT-5.44.0 \
slurm"

inherit rpm
