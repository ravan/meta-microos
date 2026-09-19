SUMMARY = "Documentation for texlive-quiz2socrative"
DESCRIPTION = "This package includes the documentation for texlive-quiz2socrative"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn52276"

RPM_NAME = "texlive-quiz2socrative-doc-2026.226.1.0svn52276-60.4.noarch.rpm"
RPM_HASH = "cff7d519e9632657d0776d6915139c138234d115afedb9efbafb53616b99b0dd978fb1b02cab7ff0b21e56490e7b9e075f930379dec64c852de6a49a234ca579"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-quiz2socrative-doc-it \
texlive-quiz2socrative-doc"

RDEPENDS:${PN} += ""

inherit rpm
