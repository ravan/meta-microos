SUMMARY = "Support Gentium fonts for LuaLaTeX and XeLaTeX"
DESCRIPTION = "This package supports the free TrueType Gentium fonts from the \
gentium-sil package and defines missing typefaces. All font \
features are available via special macros. The package works \
only for LuaLaTeX/XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn77682"

RPM_NAME = "texlive-gentium-otf-2026.226.1.01svn77682-60.2.noarch.rpm"
RPM_HASH = "9118bf78726a770c62f56ea42371327da2418aee37ab0d0a9d6bdaf892be83ed76267b8db21db4fc5fe0ddce5505ff57acc5e455db01ce7eb2c3ae9f7ebcf6a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gentium-otf.sty \
texlive-gentium-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
tex-textcomp.sty \
tex-unicode-math.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
