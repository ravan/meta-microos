SUMMARY = "Wrappers for transitition from Torque/PBS to SLURM"
DESCRIPTION = "Wrapper scripts for aiding migration from Torque/PBS to SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "slurm-torque-25.11.2-1.6.aarch64.rpm"
RPM_HASH = "d2d4a1e59ea079066bb13d557a9b16ce4663afd494729d73f96295b48f7d0f5984d56009ed54823ba6014495b80023d0273f55846f38cfbf85b0b0a1d66d454c"

RPROVIDES:${PN} += "slurm-torque \
torque-client"

RDEPENDS:${PN} += "/usr/bin/perl \
libc.so.6 \
perl-Switch \
perl-slurm \
slurm-plugins"

inherit rpm
