SUMMARY = "Additional macros for Plain TeX and LaTeX in LuaTeX"
DESCRIPTION = "The package provides a coherent extended programming \
environment for use with LuaTeX. It loads packages fontspec, \
luatexbase and lualibs, and provides additional user-level \
features and goodies. The package is under development, and its \
specification may be expected to change."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0.1svn77682"

RPM_NAME = "texlive-luatextra-2026.226.1.0.1svn77682-59.2.noarch.rpm"
RPM_HASH = "2d333de224159864414d640e7fa6613f9038e9c45782d6917669329bb56ab1407bf28b690d42784510d7449d940416ff7c23805abfc0ae8abccbd283d1e40ce6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luatextra.sty \
texlive-luatextra"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fixltx2e.sty \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-luacode.sty \
tex-luatexbase.sty \
tex-metalogo.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
