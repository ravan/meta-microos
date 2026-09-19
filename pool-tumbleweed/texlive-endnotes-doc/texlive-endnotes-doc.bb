SUMMARY = "Documentation for texlive-endnotes"
DESCRIPTION = "This package includes the documentation for texlive-endnotes"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-endnotes-doc-2026.226.svn77682-61.4.noarch.rpm"
RPM_HASH = "1430b36266fa4333d45fe3b5fa6680b171a39d8dde0cee825d8db2162b1bb2509890acf084ab80660d4766d0b3d56b2a75d8fbc11e7a95da2a88cde2662e63fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
