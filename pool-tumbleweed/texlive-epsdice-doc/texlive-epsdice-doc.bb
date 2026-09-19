SUMMARY = "Documentation for texlive-epsdice"
DESCRIPTION = "This package includes the documentation for texlive-epsdice"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn15878"

RPM_NAME = "texlive-epsdice-doc-2026.226.2.1svn15878-61.4.noarch.rpm"
RPM_HASH = "79524b1f850a704ce85b4c71ca6ff00c5dde797e84edc63559c087cc8b405b2f59ed619601905a747daa8a4e05eeaa965c5bc23b9c4b138367255412c0faa0c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epsdice-doc"

RDEPENDS:${PN} += ""

inherit rpm
