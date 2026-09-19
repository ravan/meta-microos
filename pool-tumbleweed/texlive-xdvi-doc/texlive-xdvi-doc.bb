SUMMARY = "Documentation for texlive-xdvi"
DESCRIPTION = "This package includes the documentation for texlive-xdvi"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn62387"

RPM_NAME = "texlive-xdvi-doc-2026.226.svn62387-59.4.noarch.rpm"
RPM_HASH = "65a340d6b25d49467ee872fc5a9647d6ab6dfe2a763d147ccef8f893063470bcdfaa749c036269a0b8521a2c44440b6971e14982551823fdc260088663c474ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-xdvi.1 \
texlive-xdvi-doc"

RDEPENDS:${PN} += ""

inherit rpm
