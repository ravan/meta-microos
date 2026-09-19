SUMMARY = "Documentation for texlive-natbib"
DESCRIPTION = "This package includes the documentation for texlive-natbib"
LICENSE = "LPPL-1.0"

PV = "2026.226.8.31bsvn77682"

RPM_NAME = "texlive-natbib-doc-2026.226.8.31bsvn77682-61.2.noarch.rpm"
RPM_HASH = "7f8217644fcf86d8a51f4bc4465b72ef2d05b97f7913bba6d1daf7ed4d5cc535db415a6709796f9dc62507679e2a3002a018c899b5efe5bcc9beb3c60c0e34ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-natbib-doc-en \
texlive-natbib-doc"

RDEPENDS:${PN} += ""

inherit rpm
