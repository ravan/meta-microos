SUMMARY = "Documentation for texlive-nomencl"
DESCRIPTION = "This package includes the documentation for texlive-nomencl"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.6svn77682"

RPM_NAME = "texlive-nomencl-doc-2026.226.5.6svn77682-61.2.noarch.rpm"
RPM_HASH = "af58d3b69e955988f7d34a04137159d3bae1e018d1b4cf4034f58d5ec6a75f5d6f7e7e925af333d9dbf896a16459f94b9911f28be0b12f243b5b01d6b077cacf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nomencl-doc"

RDEPENDS:${PN} += ""

inherit rpm
