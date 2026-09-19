SUMMARY = "Mail tool that includes job statistics in user notification email"
DESCRIPTION = "Mail program used directly by the SLURM daemons. On completion of a job, \
it waits for accounting information to be available and includes that \
information in the email body."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "slurm-seff-25.11.2-1.6.noarch.rpm"
RPM_HASH = "3afeadd3a30dd0f2f5b384d190155cf02fbd3f9bd74412340fc41c117c506f385ab21f915b90dc255bcfe0bf4a94b3a7451953cef4610ead28cd681d4192c47f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-seff"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
perl-slurm"

inherit rpm
