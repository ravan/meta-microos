SUMMARY = "LaTeX PDF management testphase bundle"
DESCRIPTION = "This is a temporary package, which is used during a test phase \
to load the new PDF management code of LaTeX. The new PDF \
management code offers backend-independent interfaces to \
central PDF dictionaries, tools to create annotations, form \
Xobjects, to embed files, and to handle PDF standards. The code \
is provided, during a testphase, as an independent package to \
allow users and package authors to safely test the code. At a \
later stage it will be integrated into the LaTeX kernel (or in \
parts into permanent support packages), and the current \
testphase bundle will be removed."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.96ysvn77467"

RPM_NAME = "texlive-pdfmanagement-testphase-2026.226.0.0.96ysvn77467-58.2.noarch.rpm"
RPM_HASH = "04c8769f5e6079074b878b124664249a1a53c7c5f5da0b49dc5abdf5b4677b4df5f6c2226afd30c2dcb1973a086579ef4e54c396ebc0987e85e25e738a9a1ded"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-color-ltx.sty \
tex-colorspace-patches-tmp-ltx.sty \
tex-hgeneric-testphase.def \
tex-hgeneric.def \
tex-hyperref-colorschemes.def \
tex-l3backend-testphase-dvipdfmx.def \
tex-l3backend-testphase-dvips.def \
tex-l3backend-testphase-dvisvgm.def \
tex-l3backend-testphase-luatex.def \
tex-l3backend-testphase-pdftex.def \
tex-l3backend-testphase-xetex.def \
tex-l3pdffield-testphase.sty \
tex-l3pdffield.sty \
tex-pdfmanagement-firstaid.sty \
tex-pdfmanagement-testphase.sty \
tex-pdfmanagement.sty \
tex-xcolor-patches-tmp-ltx.sty \
texlive-pdfmanagement-testphase"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bookmark.sty \
tex-etoolbox.sty \
tex-l3draw.sty \
tex-tagpdf-base.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
