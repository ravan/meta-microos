SUMMARY = "Responsive design methods for LaTeX"
DESCRIPTION = "Responsive design aims to display text and other design \
elements well on variety of outputs, including electronic \
devices or various paper sizes. It originated on the Web, using \
Cascading Style Sheets to change design elements. This package \
tries to achieve similar results with LaTeX. The main aim is to \
support the output of multiple editions of one document with \
readable font sizes regardless of the physical size of the \
produced PDF, from smartphones or e-ink readers to printed A4 \
pages."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1asvn76924"

RPM_NAME = "texlive-responsive-2026.226.0.0.1asvn76924-60.4.noarch.rpm"
RPM_HASH = "19f8b890ac49be4c7ff351a2bce46546473b17e7de13f5c333e51629923f5c0651d6a3e81f6b638ea48697298524fe54496d4172ced44e4d8831350e357b0650"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-responsive.sty \
texlive-responsive"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-kvoptions.sty \
tex-l3keys2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
