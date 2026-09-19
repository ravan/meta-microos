SUMMARY = "Documentation for texlive-nkarta"
DESCRIPTION = "This package includes the documentation for texlive-nkarta"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.2svn16437"

RPM_NAME = "texlive-nkarta-doc-2026.226.0.0.2svn16437-61.2.noarch.rpm"
RPM_HASH = "6eaacf511628d65a8e7d47b73e4018274fc0abea1041de6030148f2cfcf83ae1a05538ed88b5e3aafd6549bdb747373a59143c8090b31911e4846a03ccd4d562"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nkarta-doc"

RDEPENDS:${PN} += ""

inherit rpm
