SUMMARY = "Add several kinds of guillemets to the ae fonts"
DESCRIPTION = "The package enables the user to add guillemets from several \
source (Polish cmr, Cyrillic cmr, lasy and ec) to the ae fonts. \
This was useful when the ae fonts were used to produce PDF \
files, since the additional guillemets exist in fonts available \
in Adobe Type 1 format."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-aeguill-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "45beb62f997eaf3e59e868c361bcd1031d9ca6e5137e8a8cecda590dfdd878eeca00a727fefc3eb0f65387f936cd5e1a28e4b0ed005389066c266738ab017d1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aeguill.sty \
texlive-aeguill"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ae.sty \
tex-fontenc.sty \
tex-latexsym.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
