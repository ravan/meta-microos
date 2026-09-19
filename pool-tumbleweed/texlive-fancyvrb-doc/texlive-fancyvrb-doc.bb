SUMMARY = "Documentation for texlive-fancyvrb"
DESCRIPTION = "This package includes the documentation for texlive-fancyvrb"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.6svn77682"

RPM_NAME = "texlive-fancyvrb-doc-2026.226.4.6svn77682-59.2.noarch.rpm"
RPM_HASH = "9632d052b3055fbaf93b64ef3f68ea965ed66c873a4cbd9a935bb1d65930b03bd771c80c9a61799a9deafb97ccca99a45023e32a61538ea39731154b6aa29389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancyvrb-doc"

RDEPENDS:${PN} += ""

inherit rpm
