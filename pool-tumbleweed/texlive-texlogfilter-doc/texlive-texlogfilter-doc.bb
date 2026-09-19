SUMMARY = "Documentation for texlive-texlogfilter"
DESCRIPTION = "This package includes the documentation for texlive-texlogfilter"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.4svn71525"

RPM_NAME = "texlive-texlogfilter-doc-2026.227.1.4svn71525-62.2.noarch.rpm"
RPM_HASH = "c81a7201afa3c430d2200cd339ff1636a734dbdc66fb1cecda4622f204b3826ee20e50e523d5b153e0a791c764bf482098d3defc4236b50c395685b6e056e925"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-texlogfilter.1 \
texlive-texlogfilter-doc"

RDEPENDS:${PN} += ""

inherit rpm
