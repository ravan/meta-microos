SUMMARY = "Documentation for texlive-raleway"
DESCRIPTION = "This package includes the documentation for texlive-raleway"
LICENSE = "OFL-1.1"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-raleway-doc-2026.226.1.6svn77682-60.4.noarch.rpm"
RPM_HASH = "46624837795aa4f2a0abeee35c0e61c5217643871d3594306b5b07461260a69ff375468d56edd591a145a60ff2e19fdcfea05bd451d1ffe8e963cd1659eebbad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-raleway-doc"

RDEPENDS:${PN} += ""

inherit rpm
