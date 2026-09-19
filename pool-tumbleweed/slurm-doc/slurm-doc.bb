SUMMARY = "Documentation for SLURM"
DESCRIPTION = "Documentation (HTML) for the SLURM cluster managment software."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "slurm-doc-25.11.2-1.6.noarch.rpm"
RPM_HASH = "4f8a1516b40691b846439509ef87146b33f0acb6963613bfdd00f6116f4fdf73526a71735908722768eb6917ea9bba0885eedadb0cc5e217139599bee1c51750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-doc"

RDEPENDS:${PN} += ""

inherit rpm
