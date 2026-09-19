SUMMARY = "Documentation for texlive-pst-intersect"
DESCRIPTION = "This package includes the documentation for texlive-pst-intersect"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn33210"

RPM_NAME = "texlive-pst-intersect-doc-2026.226.0.0.4svn33210-59.2.noarch.rpm"
RPM_HASH = "44991ea26488dc94d32d48cb0bc908d01f46821c22390e84e267a33a8cf598adb08b191ddadec3f5995d09c65205b2ea2ba7012a1806582bffeaac3cda8ead61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-intersect-doc-de;en \
texlive-pst-intersect-doc"

RDEPENDS:${PN} += ""

inherit rpm
