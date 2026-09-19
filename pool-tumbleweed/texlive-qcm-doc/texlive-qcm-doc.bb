SUMMARY = "Documentation for texlive-qcm"
DESCRIPTION = "This package includes the documentation for texlive-qcm"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn63833"

RPM_NAME = "texlive-qcm-doc-2026.226.2.1svn63833-60.4.noarch.rpm"
RPM_HASH = "bdd89fa1e851de8ea9b0916896f238519d6fe1c3e26d0725fd760feb39fff2588bb88c62ed4d0989a890fb25c8813adacffcff92d18e96bd34c1fa8e9884832e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qcm-doc"

RDEPENDS:${PN} += ""

inherit rpm
