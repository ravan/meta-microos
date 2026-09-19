SUMMARY = "Wrapper for XeTeX's and LuaTeX's input normalization"
DESCRIPTION = "This package provides a cross engine interface to normalizing \
input before it's read by TeX. It is based on XeTeX's \
\\XeTeXinputnormalization primitive and lua-uni-algos for \
LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn78101"

RPM_NAME = "texlive-inputnormalization-2026.226.0.0.2svn78101-60.2.noarch.rpm"
RPM_HASH = "b0ef80757c67fcd252699150fd3fb5c041c7b87de788b95963098f811925a59824f278067ac6534abe9afb3f9d9b770eef8a8ae4c9f2d86e2cd75a4ad3d5ca2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-inputnormalization.sty \
texlive-inputnormalization"

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
