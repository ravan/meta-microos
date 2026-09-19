SUMMARY = "Documentation for texlive-pst-fr3d"
DESCRIPTION = "This package includes the documentation for texlive-pst-fr3d"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10svn15878"

RPM_NAME = "texlive-pst-fr3d-doc-2026.226.1.10svn15878-59.2.noarch.rpm"
RPM_HASH = "62f855fd34c8d82c9b7fce6d55730bf9798dd3de858db6118d5972cbb5542afb5f36f8ee4ca4871f612329e5210d09df58976f2d05fb9051cc8cc029e929f1ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-fr3d-doc"

RDEPENDS:${PN} += ""

inherit rpm
