SUMMARY = "Documentation for texlive-librebodoni"
DESCRIPTION = "This package includes the documentation for texlive-librebodoni"
LICENSE = "OFL-1.1"

PV = "2026.226.svn64431"

RPM_NAME = "texlive-librebodoni-doc-2026.226.svn64431-61.2.noarch.rpm"
RPM_HASH = "1b0fde079d36647dc0f86829c1c98a3139316ad0caf3cfbf39915ce829cec908b3f947661c3fe9eb58187cc6a1ba5782b0c83f121e5e459a138488559dd9349d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-librebodoni-doc"

RDEPENDS:${PN} += ""

inherit rpm
