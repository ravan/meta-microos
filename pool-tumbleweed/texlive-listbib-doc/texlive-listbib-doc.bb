SUMMARY = "Documentation for texlive-listbib"
DESCRIPTION = "This package includes the documentation for texlive-listbib"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.2svn29349"

RPM_NAME = "texlive-listbib-doc-2026.226.2.2svn29349-61.2.noarch.rpm"
RPM_HASH = "16933f4d0dfd5d579bd805719800f020dc04f4f65170a66ef400d369f3cc0e024b3eb0a603ccd49ddb19a51a3a837b81bb72bcaae2ea3495fd6cf66da9dafb87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-listbib-doc"

RDEPENDS:${PN} += ""

inherit rpm
