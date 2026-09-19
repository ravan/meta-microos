SUMMARY = "Documentation for texlive-bxcalc"
DESCRIPTION = "This package includes the documentation for texlive-bxcalc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn56431"

RPM_NAME = "texlive-bxcalc-doc-2026.226.1.1svn56431-59.2.noarch.rpm"
RPM_HASH = "33c97cb2fa575dc394b3d641da979b7391d2d4f2c0f24199c962481cf07b5720c6644066e44c43e859ce5b04a868279ebecd9e0557b90c65293e44f497aab4db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxcalc-doc"

RDEPENDS:${PN} += ""

inherit rpm
