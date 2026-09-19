SUMMARY = "Documentation for texlive-feynmf"
DESCRIPTION = "This package includes the documentation for texlive-feynmf"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.08svn77682"

RPM_NAME = "texlive-feynmf-doc-2026.226.1.08svn77682-59.2.noarch.rpm"
RPM_HASH = "90c2e82fa3244069191cf8ef67e9c7544a9e7eed8be8bf5a944a93a41cd456f48fa9066d7154f8b4ebd37e76196778321abde812d3b24e3681e2e49999650242"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-feynmf-doc"

RDEPENDS:${PN} += ""

inherit rpm
