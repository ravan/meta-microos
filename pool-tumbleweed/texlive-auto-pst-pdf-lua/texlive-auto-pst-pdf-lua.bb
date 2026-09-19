SUMMARY = "Using LuaLaTeX together with PostScript code"
DESCRIPTION = "This package is a slightly modified version of auto-pst-pdf by \
Will Robertson, which itself is a wrapper for pst-pdf by Rolf \
Niepraschk. The package allows the use of LuaLaTeX together \
with PostScript related code, eg. PSTricks. It depends on \
ifpdf, ifluatex, ifplatform, and xkeyval."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03asvn77682"

RPM_NAME = "texlive-auto-pst-pdf-lua-2026.226.0.0.03asvn77682-60.2.noarch.rpm"
RPM_HASH = "3252d8e51f57731779c6c7c7597c9d9a39095e64885799e3ee210921efffbf0cab7219dd532730193c9c3b7b2e7a5df1e615598f0d86ef7edd3565dbffd64d1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-auto-pst-pdf-lua.sty \
texlive-auto-pst-pdf-lua"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-ifplatform.sty \
tex-pst-pdf.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
