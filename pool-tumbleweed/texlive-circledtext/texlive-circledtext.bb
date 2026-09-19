SUMMARY = "Create circled text"
DESCRIPTION = "This LaTeX package provides a macro \\circledtext to typeset \
circled text. Its starred version can produce an inverted \
version."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2svn77682"

RPM_NAME = "texlive-circledtext-2026.226.1.1.2svn77682-60.2.noarch.rpm"
RPM_HASH = "8845ee3093a39509e20185c1bdc5aa943df74d4e94b0295ead40e2ce56ccce97d292eff4ff926fedd4641e49eb4d39cb9e6095a26bde99df3862b2144978de8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-circledtext.sty \
texlive-circledtext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3draw.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
