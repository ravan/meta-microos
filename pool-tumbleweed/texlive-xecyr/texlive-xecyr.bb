SUMMARY = "Using Cyrillic languages in XeTeX"
DESCRIPTION = "Helper tools for using Cyrillic languages with XeLaTeX and \
babel."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-xecyr-2026.226.1.2svn77682-59.4.noarch.rpm"
RPM_HASH = "4c42067244b014e4d1481ce80dc269b6112cc4a3c5520a3cf053a1f15e2fa1a2cbacf1792b5fc5881ae1a7279ee487e3f2c166703d8c136546ab4267d01201ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xecyr.sty \
texlive-xecyr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-luatextra.sty \
tex-misccorr.sty \
tex-xltxtra.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
