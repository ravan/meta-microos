SUMMARY = "Documentation for texlive-neoschool"
DESCRIPTION = "This package includes the documentation for texlive-neoschool"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.1svn78056"

RPM_NAME = "texlive-neoschool-doc-2026.226.1.3.1svn78056-61.2.noarch.rpm"
RPM_HASH = "e80c6530a13f40d3ab5aa08824e5dd63e1d2375599c55f00831fe103a53a10b1b5b05de97a9be953a3a5a4c6b1478702169a17f4c78d6b503784019257d8780f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-neoschool-doc-fr;en \
texlive-neoschool-doc"

RDEPENDS:${PN} += ""

inherit rpm
