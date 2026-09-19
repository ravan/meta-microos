SUMMARY = "Documentation for texlive-pictochrono"
DESCRIPTION = "This package includes the documentation for texlive-pictochrono"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn75622"

RPM_NAME = "texlive-pictochrono-doc-2026.226.0.0.1.1svn75622-58.2.noarch.rpm"
RPM_HASH = "cec46732e21607adf082fa3773431fff1c2a8ef0b0ee0596c69e8001ba51d311f865a840006182fae2e6f00804c9602cc4c62a7243da92b6c79277b05aa94cd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pictochrono-doc"

RDEPENDS:${PN} += ""

inherit rpm
