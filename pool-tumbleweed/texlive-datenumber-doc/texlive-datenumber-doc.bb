SUMMARY = "Documentation for texlive-datenumber"
DESCRIPTION = "This package includes the documentation for texlive-datenumber"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn78101"

RPM_NAME = "texlive-datenumber-doc-2026.226.0.0.03svn78101-61.2.noarch.rpm"
RPM_HASH = "bfb56bb218e98216d745f8ebc522fdb6206fd41c55255a059f184c330952dea46a44616962345f7ba8dd0f7d79416f4acb4e06c882f0a5dbdd87f435c14601d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-datenumber-doc-de \
texlive-datenumber-doc"

RDEPENDS:${PN} += ""

inherit rpm
