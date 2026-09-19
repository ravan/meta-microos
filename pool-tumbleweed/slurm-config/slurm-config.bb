SUMMARY = "Config files and directories for slurm services"
DESCRIPTION = "This package contains the slurm config files necessary direcories \
for the slurm daemons."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "slurm-config-25.11.2-1.6.noarch.rpm"
RPM_HASH = "d23de35006f97acc3cbf3c39dd86ed84227360442331762bc6c6654bc7e88fd97f765f2854f3b47cc0342f78ea8fc5835b6f82c34a6e3c4e4487360eafea9a32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-slurm-config \
group-slurm \
slurm-config \
user-slurm"

RDEPENDS:${PN} += "/usr/bin/sh \
logrotate \
shadow \
sysuser-shadow"

inherit rpm
