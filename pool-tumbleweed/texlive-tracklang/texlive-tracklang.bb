SUMMARY = "Language and dialect tracker"
DESCRIPTION = "The tracklang package is provided for package developers who \
want a simple interface to find out which languages the user \
has requested through packages such as babel or polyglossia. \
This package does not provide any translations! Its purpose is \
simply to track which languages have been requested by the \
user. Generic TeX code is in tracklang.tex for non-LaTeX users."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6.6svn77682"

RPM_NAME = "texlive-tracklang-2026.226.1.6.6svn77682-59.2.noarch.rpm"
RPM_HASH = "fe7a1015a8f01e987e569fe3f7bb472d4c9ef67a30275ffcf13d4020843d34b0ac047e7b32c749576955dd7acf3bd9ca52f7977815ed35a88132086af857ea2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tracklang-region-codes.tex \
tex-tracklang-scripts.sty \
tex-tracklang-scripts.tex \
tex-tracklang.sty \
tex-tracklang.tex \
texlive-tracklang"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
