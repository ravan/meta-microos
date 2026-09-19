SUMMARY = "Documentation for texlive-splitbib"
DESCRIPTION = "This package includes the documentation for texlive-splitbib"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.17svn77682"

RPM_NAME = "texlive-splitbib-doc-2026.226.1.17svn77682-64.2.noarch.rpm"
RPM_HASH = "020d912933c3311ede9a466f8f67153030c5dec09cc971c168a4d1ea7018129fcfab9b120026ad17df0ff5307c770a03055aaeef2d5579452bfb41239cb88db5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-splitbib-doc"

RDEPENDS:${PN} += ""

inherit rpm
