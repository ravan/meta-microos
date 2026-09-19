SUMMARY = "Documentation for texlive-niceframe-type1"
DESCRIPTION = "This package includes the documentation for texlive-niceframe-type1"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn71849"

RPM_NAME = "texlive-niceframe-type1-doc-2026.226.svn71849-61.2.noarch.rpm"
RPM_HASH = "3885c9d9492e76b9fff508a627ae99aa7cbd493fb18f6eb8d8739f761b792f575dfa667a934693c8673e4ee9222e268e5a87fa3eafede97740847c7208e6a026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-niceframe-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
