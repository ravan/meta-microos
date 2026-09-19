SUMMARY = "Perl tool to print SLURM job state information"
DESCRIPTION = "This package contains a Perl tool to print SLURM job state information."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "slurm-sjstat-25.11.2-1.6.noarch.rpm"
RPM_HASH = "458d4242f72869095adebbb5c666687591f86fc7479a9eb890679ac63b2978c3dc60fabf12a39c2cb12cad87b1ae25f5bff63ca85ccf7b83f1008b27e1e810dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-sjstat"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
slurm"

inherit rpm
