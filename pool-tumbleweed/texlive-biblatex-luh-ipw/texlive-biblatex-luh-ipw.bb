SUMMARY = "BibLaTeX styles for social sciences"
DESCRIPTION = "The bundle is a small collection of styles for BibLaTeX. It was \
designed for citations in the Humanities, following the \
guidelines of style of the institutes for the social sciences \
of the Leibniz University Hannover/LUH (especially the \
Institute of Political Science). The bundle depends on BibLaTeX \
(version 1.1 at least) and cannot be used without it."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn32180"

RPM_NAME = "texlive-biblatex-luh-ipw-2026.226.0.0.3svn32180-61.2.noarch.rpm"
RPM_HASH = "3393e322d50313496f4ae624933d66246f1bc560b17cab0b4a7147cea9df6e3ec2b63d5b8e239abcdcee17dd7fdb67d8fdf7d517922af2e588c8bfdf4b6217b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-authoryear-luh-ipw.bbx \
tex-authoryear-luh-ipw.cbx \
tex-english-luh-ipw.lbx \
tex-german-luh-ipw.lbx \
tex-standard-luh-ipw.bbx \
tex-standard-luh-ipw.cbx \
tex-verbose-inote-luh-ipw.bbx \
tex-verbose-inote-luh-ipw.cbx \
texlive-biblatex-luh-ipw"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear-icomp.bbx \
tex-authoryear-icomp.cbx \
tex-verbose-inote.bbx \
tex-verbose-inote.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
