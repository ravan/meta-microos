SUMMARY = "The Lexend fonts for XeLaTeX and LuaLaTeX through fontspec"
DESCRIPTION = "The purpose of this package is pretty straightforward: The \
Lexend font collection has been designed by Dr. Bonnie \
Shaver-Troup and Thomas Jockin to make reading easier for \
everyone. Now my goal is to bring this wonderful collection to \
the world of LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0.70svn77682"

RPM_NAME = "texlive-lexend-2026.226.1.1.0.70svn77682-61.2.noarch.rpm"
RPM_HASH = "32e8ea8af817d399ed70caa680a9cae8bdee913336a8cafb273233944d42f1634ccf329b8d2cb593bffb6aa149a3830ba2767c020dc960dfe4b8d811603b9a51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lexend.sty \
texlive-lexend"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-fontspec.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lexend-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
