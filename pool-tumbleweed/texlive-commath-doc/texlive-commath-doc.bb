SUMMARY = "Documentation for texlive-commath"
DESCRIPTION = "This package includes the documentation for texlive-commath"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn15878"

RPM_NAME = "texlive-commath-doc-2026.226.0.0.3svn15878-60.2.noarch.rpm"
RPM_HASH = "bb49e40ffa64f4639574c95573f655fc0aef899afe8b3883c12b07947b61e09bdc9749ced77e8d40a322e3f2d86c0862f42f428e418d882aa95c3f8af27ec6d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-commath-doc"

RDEPENDS:${PN} += ""

inherit rpm
