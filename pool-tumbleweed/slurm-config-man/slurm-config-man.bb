SUMMARY = "Config files and directories for slurm services"
DESCRIPTION = "Man pages for the SLURM cluster managment software config files."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "slurm-config-man-25.11.2-1.6.noarch.rpm"
RPM_HASH = "abf88afc5a6f0ac88ae0f622355afc30a6772b4ab451d1a934d23afb21835c8834baa1d8871ac25584b80e924b695c13fb56ebd37585f7ac3ce2f9da65716dee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-config-man"

RDEPENDS:${PN} += ""

inherit rpm
