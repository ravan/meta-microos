SUMMARY = "Documentation for texlive-ukbill"
DESCRIPTION = "This package includes the documentation for texlive-ukbill"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.1svn69362"

RPM_NAME = "texlive-ukbill-doc-2026.226.1.2.1svn69362-60.2.noarch.rpm"
RPM_HASH = "83f486b25e46132485e821badaacd9c85c26e6f92c96e35789771c9da045b87646efb96e07b5168eafdb3b0fd95b6db624a2981f49f8cbdf6c49c39ad47ccd31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ukbill-doc"

RDEPENDS:${PN} += ""

inherit rpm
