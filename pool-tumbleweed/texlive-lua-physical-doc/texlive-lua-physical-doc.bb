SUMMARY = "Documentation for texlive-lua-physical"
DESCRIPTION = "This package includes the documentation for texlive-lua-physical"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.5svn59138"

RPM_NAME = "texlive-lua-physical-doc-2026.226.1.0.5svn59138-59.2.noarch.rpm"
RPM_HASH = "1c214dbf05671d0147f2d43209521141fd6bf70cc3998880845c061c1e78be942b87003d4cb039bbb95a8684c75ba991a1248d1152adb2ac7a78fc13e9f4f74a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-physical-doc"

RDEPENDS:${PN} += ""

inherit rpm
