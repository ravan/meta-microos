SUMMARY = "Documentation for texlive-ecv"
DESCRIPTION = "This package includes the documentation for texlive-ecv"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn24928"

RPM_NAME = "texlive-ecv-doc-2026.226.0.0.3svn24928-61.4.noarch.rpm"
RPM_HASH = "6d296bf221e422034079166e0e0a033631c8d632775d194c3870ecd0b4ce81c9edfa4357ebc0cf518e986c9ee9a7565bd236391f69dc598476224f3f883462bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ecv-doc-de;en \
texlive-ecv-doc"

RDEPENDS:${PN} += ""

inherit rpm
