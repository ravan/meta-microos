SUMMARY = "Macros for RTL typesetting"
DESCRIPTION = "This package provides some macros for right-to-left \
typesetting. It uses by default the arabic fonts Scheherazade \
and ALM fixed, the only monospaced arabic font. The package \
works with LuaLaTeX or XeLaTeX, but not with pdfLaTeX or latex."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn76924"

RPM_NAME = "texlive-hvarabic-2026.226.0.0.02svn76924-60.2.noarch.rpm"
RPM_HASH = "31b5a694cc87a95e7df274bb456967e6b733f727d9a2be15bbdfccaf4498f8fb6bf096b82bd22ac9c015be95483c8985a3105a99d83c4dac975ea02a364a8ca0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hvarabic.sty \
texlive-hvarabic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
