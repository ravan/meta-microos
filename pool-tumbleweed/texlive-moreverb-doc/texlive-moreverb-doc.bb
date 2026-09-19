SUMMARY = "Documentation for texlive-moreverb"
DESCRIPTION = "This package includes the documentation for texlive-moreverb"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3asvn77682"

RPM_NAME = "texlive-moreverb-doc-2026.226.2.3asvn77682-61.2.noarch.rpm"
RPM_HASH = "fc9d2e50e2ad9c055375f7b3730ff0d62499219bef012978f6b6419af4618a23955bbf63180fb3091ea02bb492b34f68a7af465ad21a1f9c9a84f6f424a0200e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-moreverb-doc"

RDEPENDS:${PN} += ""

inherit rpm
