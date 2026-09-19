SUMMARY = "Write and execute external code, and insert the output"
DESCRIPTION = "This package allows to write MetaPost, TeX, ConTeXt, LaTeX, \
LuaTeX, LuaLaTeX, XeTeX, XeLaTeX, Lua, Perl, or Python source \
code into an external file, run that file via shell-escape to \
create PDF, PNG, or text output, and include that output \
automatically into the main LaTeX document."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.42svn76924"

RPM_NAME = "texlive-hvextern-2026.226.0.0.42svn76924-60.2.noarch.rpm"
RPM_HASH = "56ffd0d4d50f2a8baf657d2ffac94c0deeca359a50a9e5affa806ccbd56967f46183478d4f531b9ab88403efbc1334a6e398540caa89016b1f2efc41048e45d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hvextern.sty \
texlive-hvextern"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-comment.sty \
tex-fancyvrb.sty \
tex-filemod.sty \
tex-graphicx.sty \
tex-ifoddpage.sty \
tex-ifplatform.sty \
tex-iftex.sty \
tex-listings.sty \
tex-shellesc.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
