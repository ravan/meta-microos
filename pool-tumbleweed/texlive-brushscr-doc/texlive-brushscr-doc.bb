SUMMARY = "Documentation for texlive-brushscr"
DESCRIPTION = "This package includes the documentation for texlive-brushscr"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn28363"

RPM_NAME = "texlive-brushscr-doc-2026.226.svn28363-59.2.noarch.rpm"
RPM_HASH = "be98460098b3cd92f4dae38f0b6a550c56faf0c8210dcda351119665834f1d89c2e2db16887d85ae655716a3b27f111a54c940a048fcfb989fa05c33ec03be8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-brushscr-doc"

RDEPENDS:${PN} += ""

inherit rpm
