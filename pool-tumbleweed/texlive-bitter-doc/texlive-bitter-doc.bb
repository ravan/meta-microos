SUMMARY = "Documentation for texlive-bitter"
DESCRIPTION = "This package includes the documentation for texlive-bitter"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-bitter-doc-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "1a96196dd011397a691718eb545662e05a61cc77369df296b9a0ffb1cafaada1965278a70b84b205d3437a001bf73bd893cd9983bf61bd3955c24de48bd7e130"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bitter-doc"

RDEPENDS:${PN} += ""

inherit rpm
