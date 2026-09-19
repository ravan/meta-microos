SUMMARY = "Parse macro arguments with Lua using xparse-like specification"
DESCRIPTION = "The name lparse is derived from xparse. The 'x' has been \
replaced by an 'l' because this package only works with LuaTeX. \
'l' stands for 'Lua'. Just as with xparse, it is possible to \
use a special syntax consisting of single letters to express \
the arguments of a macro. However, lparse is able to read \
arguments regardless of the macro system used -- whether LaTeX, \
or ConTeXt, or even plain TeX. Of course, LuaTeX must always be \
used as the engine."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.0svn78101"

RPM_NAME = "texlive-lparse-2026.226.0.0.3.0svn78101-61.2.noarch.rpm"
RPM_HASH = "69a2e55295f94d812e70661c5c3325f64c60678cc0ac49644cefaf8efc7977d24abf984dcba66021c2e090503d49c30d8a2f26ef8b283ad0536af526b613d7f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lparse.sty \
tex-lparse.tex \
texlive-lparse"

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
