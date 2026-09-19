SUMMARY = "Documentation for texlive-hobby"
DESCRIPTION = "This package includes the documentation for texlive-hobby"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.12svn76924"

RPM_NAME = "texlive-hobby-doc-2026.226.1.12svn76924-60.4.noarch.rpm"
RPM_HASH = "d07507244b85a25a024e5be68fc169a93e60b376b7c5f92712d22803ef5c598efdd3202c60f22d0df15ed0f737b0eaf477be6708543c1495af13e4913e23e6af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hobby-doc-en \
texlive-hobby-doc"

RDEPENDS:${PN} += ""

inherit rpm
