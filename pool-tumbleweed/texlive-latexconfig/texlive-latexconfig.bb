SUMMARY = "Configuration files for LaTeX-related formats"
DESCRIPTION = "The latexconfig package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn68923"

RPM_NAME = "texlive-latexconfig-2026.226.svn68923-61.2.noarch.rpm"
RPM_HASH = "0c86b0ac61475f3d48bc4a6e1800d958998261aa55d062ee92deb8850c34c7c6e4e5ea4b3f49568a95c390db3bf6ddd7f7b026d62073a8fdb63103fe253f2be8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epstopdf-sys.cfg \
tex-lualatexiniconfig.tex \
texlive-latexconfig"

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
