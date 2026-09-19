SUMMARY = "Documentation for texlive-sectsty"
DESCRIPTION = "This package includes the documentation for texlive-sectsty"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.2svn77682"

RPM_NAME = "texlive-sectsty-doc-2026.226.2.0.2svn77682-60.2.noarch.rpm"
RPM_HASH = "faf15f6fbf3479e8133f0e2d45ef02a0991cf8a2719256a0a64e9f519c89bdce40394c53d269687021ea069afb849cff88e57028d2c97120208ee1b3c0947c7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sectsty-doc"

RDEPENDS:${PN} += ""

inherit rpm
