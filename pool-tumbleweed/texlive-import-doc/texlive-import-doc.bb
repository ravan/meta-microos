SUMMARY = "Documentation for texlive-import"
DESCRIPTION = "This package includes the documentation for texlive-import"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.6.2svn77682"

RPM_NAME = "texlive-import-doc-2026.226.6.2svn77682-60.2.noarch.rpm"
RPM_HASH = "3544c4457b0b9fe716cd5caf5b7303bd4e77e0c06ae07536771abadba8433ec272de747c08b0f7364fe9f02eabe00b4e4978401cf6b1c294aa9267fde737d6f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-import-doc"

RDEPENDS:${PN} += ""

inherit rpm
