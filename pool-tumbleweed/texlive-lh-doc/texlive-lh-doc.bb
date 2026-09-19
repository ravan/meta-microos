SUMMARY = "Documentation for texlive-lh"
DESCRIPTION = "This package includes the documentation for texlive-lh"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.5gsvn77838"

RPM_NAME = "texlive-lh-doc-2026.226.3.5gsvn77838-61.2.noarch.rpm"
RPM_HASH = "dfae155344e966f15d9e91e24d406a265d14c988aab9a1a1808e0f4d8255ac4cbe852b97ba299d25cf30b661297a43b8c56559651c81d1e0774d5ca8799b7293"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lh-doc"

RDEPENDS:${PN} += ""

inherit rpm
