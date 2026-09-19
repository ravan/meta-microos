SUMMARY = "Documentation for texlive-crimson"
DESCRIPTION = "This package includes the documentation for texlive-crimson"
LICENSE = "OFL-1.1"

PV = "2026.226.svn75712"

RPM_NAME = "texlive-crimson-doc-2026.226.svn75712-61.2.noarch.rpm"
RPM_HASH = "61eabc1d8bb5181994d2623ee6f2cc7ab8e24b56346f76dbf493342a40a947bcac780e85f7fd68a5451d596898fb1121b3c5a87f9fc948e231dad787e71ca8dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crimson-doc"

RDEPENDS:${PN} += ""

inherit rpm
