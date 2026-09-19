SUMMARY = "Documentation for texlive-kixfont"
DESCRIPTION = "This package includes the documentation for texlive-kixfont"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn18488"

RPM_NAME = "texlive-kixfont-doc-2026.226.svn18488-63.2.noarch.rpm"
RPM_HASH = "2ee41c8cfcf7f2d1e7c8b31cd371dc247bbddfd918e7cfc739a07fe7f38ad1d4dd3bae17f8525e96f68a4efabed289aca1f217fc83013b2925160ddb7495c069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kixfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
