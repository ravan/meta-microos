SUMMARY = "Documentation for texlive-latexmp"
DESCRIPTION = "This package includes the documentation for texlive-latexmp"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.2.1svn55643"

RPM_NAME = "texlive-latexmp-doc-2026.226.1.2.1svn55643-61.2.noarch.rpm"
RPM_HASH = "175d868a1f9fd6668a69dab07d0bee0a303f153e5530402a1b25aa09a1be805fdbcb8d7fcd37d8e221bae36807cfbc13a1f49f3661226b953a0209503710de0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexmp-doc"

RDEPENDS:${PN} += ""

inherit rpm
