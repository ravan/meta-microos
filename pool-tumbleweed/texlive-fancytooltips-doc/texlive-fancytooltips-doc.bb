SUMMARY = "Documentation for texlive-fancytooltips"
DESCRIPTION = "This package includes the documentation for texlive-fancytooltips"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8svn68931"

RPM_NAME = "texlive-fancytooltips-doc-2026.226.1.8svn68931-59.2.noarch.rpm"
RPM_HASH = "dffffa61755bee18305894bce1cb3071a1dfdc054fce05881b90985915087ebcc03529b7f93be4ca76d30003a81f9361abb1b94018b572521b855d9579b3f060"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancytooltips-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
