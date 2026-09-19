SUMMARY = "Documentation for texlive-texdraw"
DESCRIPTION = "This package includes the documentation for texlive-texdraw"
LICENSE = "LPPL-1.0"

PV = "2026.227.v2r3svn64477"

RPM_NAME = "texlive-texdraw-doc-2026.227.v2r3svn64477-62.2.noarch.rpm"
RPM_HASH = "7f72acc1c30de73632a5089b34fdf42da7feb21c66a1f36e5579eb07438294fb38b40ef258809955e5df073d093d2759f2f93450134e1acd5195912af79fee59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texdraw-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
