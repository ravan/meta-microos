SUMMARY = "Documentation for texlive-ndsu-thesis-2022"
DESCRIPTION = "This package includes the documentation for texlive-ndsu-thesis-2022"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn63881"

RPM_NAME = "texlive-ndsu-thesis-2022-doc-2026.226.svn63881-61.2.noarch.rpm"
RPM_HASH = "901a75dac3ac7599dc96cd8b48c0b539af70a18b0e63ff5760e22942b604cffafd2fe190c334228c69080793bf26dc926515581a2aad7853f61229c097376347"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ndsu-thesis-2022-doc"

RDEPENDS:${PN} += ""

inherit rpm
