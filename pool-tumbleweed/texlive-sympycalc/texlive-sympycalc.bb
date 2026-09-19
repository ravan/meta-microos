SUMMARY = "Work with SymPy and PyLuaTeX"
DESCRIPTION = "This package provides some commands (mostly for French users) \
to perform SymPy commands and format the result with some \
adjustments in formatting: \\sympycalc to perform a generic \
SymPy command; \\sympyfact or \\sympydev to factor or expand; \
\\sympyderiv, \\sympyprim or \\sympyintegr to derive or integrate \
; \\sympyreso to resolve equations ..."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn73069"

RPM_NAME = "texlive-sympycalc-2026.226.0.0.1.1svn73069-64.2.noarch.rpm"
RPM_HASH = "028984ebfc4a226481fc48006e0bcf487d0d8e4024dfb0eadff699cd5fd0311475890649c99a5f8b2ee1e7a61e740d9bb2151fcaad27de6b9bfa86acd0e41d65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-SympyCalc.sty \
texlive-sympycalc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
