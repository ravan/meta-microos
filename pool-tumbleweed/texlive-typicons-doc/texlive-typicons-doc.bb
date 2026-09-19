SUMMARY = "Documentation for texlive-typicons"
DESCRIPTION = "This package includes the documentation for texlive-typicons"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.7svn77682"

RPM_NAME = "texlive-typicons-doc-2026.226.2.0.7svn77682-59.2.noarch.rpm"
RPM_HASH = "327300c65d266c2a5a3eac8ee56451b36fb0f460a5a6547a4fb617db27e8d6e8867c0d61762bf168cc9fca3c6d701284b441203a1b7cd102a5af21917767e752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typicons-doc"

RDEPENDS:${PN} += ""

inherit rpm
