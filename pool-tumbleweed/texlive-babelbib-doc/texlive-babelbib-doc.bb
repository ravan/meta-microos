SUMMARY = "Documentation for texlive-babelbib"
DESCRIPTION = "This package includes the documentation for texlive-babelbib"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.34svn76790"

RPM_NAME = "texlive-babelbib-doc-2026.226.1.34svn76790-60.2.noarch.rpm"
RPM_HASH = "80edfc2e491239ced5ba5538112065a0c1f6979c3d8cd3ceefc090e5cf153292345df80c33dfe481e275fe6d9482f27041ad8c25cd9eefa7708dd2ffef434e4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babelbib-doc"

RDEPENDS:${PN} += ""

inherit rpm
