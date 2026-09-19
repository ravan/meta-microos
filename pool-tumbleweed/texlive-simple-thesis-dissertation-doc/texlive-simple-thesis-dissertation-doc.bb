SUMMARY = "Documentation for texlive-simple-thesis-dissertation"
DESCRIPTION = "This package includes the documentation for texlive-simple-thesis-dissertation"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn43058"

RPM_NAME = "texlive-simple-thesis-dissertation-doc-2026.226.svn43058-60.2.noarch.rpm"
RPM_HASH = "080df934d5bae57dade9f90fa4341e38e13db49eb12a155da9d2c742cdcbe9e5cad5d919441d58bfaeacf1ebcb1f520530144c4e651c3fd1f3cfc35d655de47a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simple-thesis-dissertation-doc"

RDEPENDS:${PN} += ""

inherit rpm
