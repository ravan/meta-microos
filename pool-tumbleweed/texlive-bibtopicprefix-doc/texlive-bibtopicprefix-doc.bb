SUMMARY = "Documentation for texlive-bibtopicprefix"
DESCRIPTION = "This package includes the documentation for texlive-bibtopicprefix"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10svn15878"

RPM_NAME = "texlive-bibtopicprefix-doc-2026.226.1.10svn15878-61.2.noarch.rpm"
RPM_HASH = "02d237abe7ab32f16bebb75ca71f49550d2ba6f188523a1e27a2dd6aba807c739e31fac209cd744d819970a50d5520d9e2036231e8d2a0cff82da702c256ee0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibtopicprefix-doc"

RDEPENDS:${PN} += ""

inherit rpm
