SUMMARY = "A LaTeX package to remove or suppress pdf meta-data"
DESCRIPTION = "Creating pdfs with pdfLaTeX populates several pdf meta-data \
fields such as date/time of creation/modification, information \
about the LaTeX installation (e.g., pdfTeX version), and the \
relative paths of included pdfs. The pdfprivacy package \
provides support for emptying several of these pdf meta-data \
fields as well as suppressing some pdfTeX meta-data entries in \
the resulting pdf."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn45985"

RPM_NAME = "texlive-pdfprivacy-2026.226.1.0svn45985-58.2.noarch.rpm"
RPM_HASH = "95e5b781cb2c1dabf69ccfd8ff0e1fcc62254df463e105ad262f91bc769b84bc51efab88dfc5311bc4efa0ab61d8fbd49a17e2c5fa4f1957386c8d0778311f9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfprivacy.sty \
texlive-pdfprivacy"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
