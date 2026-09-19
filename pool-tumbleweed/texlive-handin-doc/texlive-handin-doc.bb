SUMMARY = "Documentation for texlive-handin"
DESCRIPTION = "This package includes the documentation for texlive-handin"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn48255"

RPM_NAME = "texlive-handin-doc-2026.226.0.0.1.1svn48255-60.4.noarch.rpm"
RPM_HASH = "b7936d94a228c6d049799d109d9be33e8c88f816df3e61662b06d074e901eb32eb89153bde9523eb460ab7019b0430a8f95ba1b713f634f56718aa2aad9af6cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-handin-doc"

RDEPENDS:${PN} += ""

inherit rpm
