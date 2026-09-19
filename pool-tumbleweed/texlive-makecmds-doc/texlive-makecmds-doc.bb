SUMMARY = "Documentation for texlive-makecmds"
DESCRIPTION = "This package includes the documentation for texlive-makecmds"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-makecmds-doc-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "e0fe73bdd4d5891a675aa730d727c2c901a33f6580bb71216b944da6e16e7dfc1abe58164b2747520c936fff7eae6a54bafab55b4da01d763d6a6c0131321da0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makecmds-doc"

RDEPENDS:${PN} += ""

inherit rpm
