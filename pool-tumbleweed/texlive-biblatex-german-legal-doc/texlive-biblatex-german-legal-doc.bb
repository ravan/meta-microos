SUMMARY = "Documentation for texlive-biblatex-german-legal"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-german-legal"
LICENSE = "LPPL-1.0"

PV = "2026.226.003svn66461"

RPM_NAME = "texlive-biblatex-german-legal-doc-2026.226.003svn66461-61.2.noarch.rpm"
RPM_HASH = "fff3c7b17e17eda4aca312087c7586ccd8f26bb20fd36a1334f2184620057a1722a8785d8fa93337152d7f364aec38969c52ab99f2d3e13fd3cfe114c2caa7ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-german-legal-doc-de \
texlive-biblatex-german-legal-doc"

RDEPENDS:${PN} += ""

inherit rpm
