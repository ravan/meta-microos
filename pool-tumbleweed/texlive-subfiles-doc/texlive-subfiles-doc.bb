SUMMARY = "Documentation for texlive-subfiles"
DESCRIPTION = "This package includes the documentation for texlive-subfiles"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn77682"

RPM_NAME = "texlive-subfiles-doc-2026.226.2.2svn77682-64.2.noarch.rpm"
RPM_HASH = "5be4dc4665b45eec23c02565a1a95b87ca3f2d86d5c5492e51a2f295ccb80e0d4c366939d2a78fb6740ea5b493252eee8080e4dd2bc8d2277bba3590acbf1e82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subfiles-doc"

RDEPENDS:${PN} += ""

inherit rpm
