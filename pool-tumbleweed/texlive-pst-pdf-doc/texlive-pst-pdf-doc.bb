SUMMARY = "Documentation for texlive-pst-pdf"
DESCRIPTION = "This package includes the documentation for texlive-pst-pdf"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2fsvn77682"

RPM_NAME = "texlive-pst-pdf-doc-2026.226.1.2fsvn77682-60.4.noarch.rpm"
RPM_HASH = "cc4f991dbdef804583f34f2b92e08a7ba424bee3800dec84ca67f37b72570466f46982986b54d9652faaacb62aff2fa587c92fa510b6f6fca443bd7be80f670c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-pdf-doc-de;en \
texlive-pst-pdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
