SUMMARY = "Draw framed boxes with standard CSS attributes that can break over multiple pages"
DESCRIPTION = "The longfbox package provides framed boxes that can be \
customized using standard CSS attributes. It was written to \
support precise rendering of Madoko documents in LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn39028"

RPM_NAME = "texlive-longfbox-2026.226.1.0svn39028-61.2.noarch.rpm"
RPM_HASH = "d48c7ad05e77e88a88d6ddc29d1103c8f27855e98611b13ff21f7d4d60fcbb2fe2804c6a1faf4837bd9853b1936f0cba208e0f6f2462a7cc12e6f1af9db78cce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-longbox.sty \
tex-longfbox.sty \
texlive-longfbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ellipse.sty \
tex-footnote.sty \
tex-options.sty \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
