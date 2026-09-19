SUMMARY = "Documentation for texlive-ualberta"
DESCRIPTION = "This package includes the documentation for texlive-ualberta"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.0svn78219"

RPM_NAME = "texlive-ualberta-doc-2026.226.2.0.0svn78219-59.2.noarch.rpm"
RPM_HASH = "eb11c98ef7aa0cb7fda7c47bdd4e5d45b24f9d473ed49b00616916059d4d6c2a6807e5ae642f03cb066a7650e3435921f45b3517a9e146ce6e30a4bd4e617ddd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ualberta-doc"

RDEPENDS:${PN} += ""

inherit rpm
