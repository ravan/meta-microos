SUMMARY = "Documentation for texlive-dirtytalk"
DESCRIPTION = "This package includes the documentation for texlive-dirtytalk"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn20520"

RPM_NAME = "texlive-dirtytalk-doc-2026.226.1.0svn20520-59.2.noarch.rpm"
RPM_HASH = "a79b5823014abe0062f03f6e8ce55dbeb22060f70b9c30c4234c92c1ee34d5924e493607580c259edfa521967bb7457a369053fa8b811df46e6cba7b49828577"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dirtytalk-doc"

RDEPENDS:${PN} += ""

inherit rpm
