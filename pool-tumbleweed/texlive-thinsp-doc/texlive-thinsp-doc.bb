SUMMARY = "Documentation for texlive-thinsp"
DESCRIPTION = "This package includes the documentation for texlive-thinsp"
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.0.0.2svn39669"

RPM_NAME = "texlive-thinsp-doc-2026.227.0.0.2svn39669-62.2.noarch.rpm"
RPM_HASH = "71a5ca35e12b41ffe83d69a9631865d925475add0f37f638a7a8dc3cd5c2e769b54b767218f7c9696db6d2bcbf4bc69c26cac4a8a25c6c5c570bb5116f816b57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thinsp-doc"

RDEPENDS:${PN} += ""

inherit rpm
