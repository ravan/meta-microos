SUMMARY = "Documentation for texlive-labelschanged"
DESCRIPTION = "This package includes the documentation for texlive-labelschanged"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.01svn77682"

RPM_NAME = "texlive-labelschanged-doc-2026.226.1.01svn77682-63.2.noarch.rpm"
RPM_HASH = "12183a16d3c9a0f3e7002194f13af617f869494f6e30bd7d6d1799d51ed9106e33e34cb57a098a5422ba4ccbdd572f3282ad5e59e70f1af3edd668427b4d46e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-labelschanged-doc"

RDEPENDS:${PN} += ""

inherit rpm
