SUMMARY = "Documentation for texlive-lua-regression"
DESCRIPTION = "This package includes the documentation for texlive-lua-regression"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn74969"

RPM_NAME = "texlive-lua-regression-doc-2026.226.1.0.2svn74969-59.2.noarch.rpm"
RPM_HASH = "ebb6e49b81bf1dad3ab984ab49c76e574a9fa90056f229e8cb884c5ecb58fb051cabb7148a3a47250750bbed2f48c24460e4b40fced1af696e91826420781de1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-regression-doc"

RDEPENDS:${PN} += ""

inherit rpm
