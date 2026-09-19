SUMMARY = "Documentation for texlive-exteps"
DESCRIPTION = "This package includes the documentation for texlive-exteps"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.41svn19859"

RPM_NAME = "texlive-exteps-doc-2026.226.0.0.41svn19859-59.2.noarch.rpm"
RPM_HASH = "e308f7b309a50e6a3f0654fa47e1231c9af3fdc9a23ab23fc28e329de6dbd15e3cf65a6a27fef179d41b87a4a844b57e3b0ceb2d27ac787eb76ec107fe38f1a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exteps-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
