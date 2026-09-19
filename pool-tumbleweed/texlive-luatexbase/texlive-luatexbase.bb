SUMMARY = "Basic resource management for LuaTeX code"
DESCRIPTION = "The LaTeX kernel (LaTeX2e 2015/10/01 onward) builds in support \
for LuaTeX functionality, also available as ltluatex.tex for \
users of plain TeX and those with older LaTeX kernel \
implementations. This support is based on ideas taken from the \
original luatexbase package, but there are interface \
differences. This 'stub' package provides a compatibility layer \
to allow existing packages to upgrade smoothly to the new \
support structure."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-luatexbase-2026.226.1.3svn77682-59.2.noarch.rpm"
RPM_HASH = "1e163a0de51699ac49ae278ebee418d85eae78a40d78b405da16e6c1d9eb15fe119dc1c39959bc0a36bf76ce880181b161e9ff96591988be1f0c2fe67707c248"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luatexbase-attr.sty \
tex-luatexbase-cctb.sty \
tex-luatexbase-compat.sty \
tex-luatexbase-loader.sty \
tex-luatexbase-mcb.sty \
tex-luatexbase-modutils.sty \
tex-luatexbase-regs.sty \
tex-luatexbase.sty \
texlive-luatexbase"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ctablestack.sty \
texlive \
texlive-ctablestack \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
