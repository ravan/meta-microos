SUMMARY = "Showing kerns in a document"
DESCRIPTION = "The package displays all kerning values in the form of colored \
bars directly at the respective position in the document. \
Positive values are displayed in green, negative values in red. \
The width of the bars corresponds exactly to the respective \
kerning value. By option the bars can be placed behind or in \
front of the glyphs. The package requires LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn67603"

RPM_NAME = "texlive-showkerning-2026.226.0.0.3svn67603-60.2.noarch.rpm"
RPM_HASH = "d705fc1adf205160c925640e05401200ef2fcdb4c2f287337d62727f7535494275bc550c6847f87760d79ebc34183e2444b11a8c0bbec1f79cf9ba9c123278c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-showkerning.sty \
texlive-showkerning"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
