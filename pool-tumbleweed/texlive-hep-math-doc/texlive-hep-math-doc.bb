SUMMARY = "Documentation for texlive-hep-math"
DESCRIPTION = "This package includes the documentation for texlive-hep-math"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76220"

RPM_NAME = "texlive-hep-math-doc-2026.226.1.4svn76220-60.4.noarch.rpm"
RPM_HASH = "70013a4643bd9e1099007005d0eea1f0c6577e199d88c9497a8ad1078cee2c67c3e9353c6bcdb6bf4a80cbadfc605bea6a0cb8efa656c5613eec30bdd93279c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
