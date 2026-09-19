SUMMARY = "Create n-up PDF pages with minimal margins"
DESCRIPTION = "pdfxup is a Unix/Linux shell script that creates a PDF document \
where each page is obtained by combining several pages of a PDF \
file given as output. pdfxup uses ghostscript for computing the \
maximal bounding box of (some of) the pages of the document, \
and then uses pdflatex (with the graphicx package) in order to \
produce the new document."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.12svn71513"

RPM_NAME = "texlive-pdfxup-2026.226.2.12svn71513-58.2.noarch.rpm"
RPM_HASH = "2f94d9ac22b0e74a648f03f9de14867c7146ae990a32b79f10bb1ad58c5f3d8756644cc516c269cd217607313b93d2184f538c9616275b61eca0368e69d3a694"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfxup-template.tex \
texlive-pdfxup"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pdfxup-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
