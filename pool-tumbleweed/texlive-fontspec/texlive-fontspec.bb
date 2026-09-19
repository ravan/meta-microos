SUMMARY = "Advanced font selection in XeLaTeX and LuaLaTeX"
DESCRIPTION = "Fontspec is a package for XeLaTeX and LuaLaTeX. It provides an \
automatic and unified interface to feature-rich AAT and \
OpenType fonts through the NFSS in LaTeX running on XeTeX or \
LuaTeX engines. The package requires the l3kernel and xparse \
bundles from the LaTeX3 development team."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.9gsvn77682"

RPM_NAME = "texlive-fontspec-2026.226.2.9gsvn77682-60.2.noarch.rpm"
RPM_HASH = "41d728b54a525aa3d3b48d8e773d3ba0a936a10b940da7194c59e8fa10e7a53498e5d75b06a754d9e60ce569161fb989722defaf30e5aa6a6e1702d553bfa20d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fontspec-luatex.sty \
tex-fontspec-xetex.sty \
tex-fontspec.cfg \
tex-fontspec.sty \
texlive-fontspec"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-luaotfload.sty \
tex-xparse.sty \
texlive \
texlive-euenc \
texlive-filesystem \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3kernel \
texlive-l3packages \
texlive-lm \
texlive-scripts \
texlive-scripts-bin \
texlive-xunicode"

inherit rpm
