SUMMARY = "PAM module for restricting access to compute nodes via SLURM"
DESCRIPTION = "This module restricts access to compute nodes in a cluster where the Simple \
Linux Utility for Resource Managment (SLURM) is in use. Access is granted \
to root, any user with an SLURM-launched job currently running on the node, \
or any user who has allocated resources on the node according to the SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "slurm-pam_slurm-25.11.2-1.6.aarch64.rpm"
RPM_HASH = "33e7ef7b0d16a18f64b90ce2b254d8f4f593359e27458c39d3b08c39edc8a9d62eff35bcc41cdb10228fcf6a62ffdd8d3b42c69b7b2f82ecd534f58bc92745a7"

RPROVIDES:${PN} += "slurm-pam-slurm"

RDEPENDS:${PN} += "libc.so.6 \
libslurm.so.44 \
slurm-node"

inherit rpm
