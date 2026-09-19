SUMMARY = "Documentation for texlive-bubblesort"
DESCRIPTION = "This package includes the documentation for texlive-bubblesort"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn56070"

RPM_NAME = "texlive-bubblesort-doc-2026.226.1.0svn56070-59.2.noarch.rpm"
RPM_HASH = "10d40a78f33af6f2a711b489733b3451d1a6f2c1363c8a32b800556f8d50ae3eb175acbdee115466c854da555ab2517cedd985696af4634e2eefff1ce1c25f83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bubblesort-doc"

RDEPENDS:${PN} += ""

inherit rpm
