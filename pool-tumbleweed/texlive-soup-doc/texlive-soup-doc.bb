SUMMARY = "Documentation for texlive-soup"
DESCRIPTION = "This package includes the documentation for texlive-soup"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn50815"

RPM_NAME = "texlive-soup-doc-2026.226.1.0.2svn50815-64.2.noarch.rpm"
RPM_HASH = "9786603e0d395f845b4ad7534484e861d62dbe2b2713246ff1a0dcf5f1ec02e41b98a0fef0b4933367725aebbbef9cbdd6a7bcfef4845acb6a5c084f82cfde80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-soup-doc"

RDEPENDS:${PN} += ""

inherit rpm
