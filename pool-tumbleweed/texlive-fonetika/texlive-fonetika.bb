SUMMARY = "Support for the Danish 'Dania' phonetic system"
DESCRIPTION = "Fonetika Dania is a font bundle with a serif font and a sans \
serif font for the danish phonetic system Dania. Both fonts \
exist in regular and bold weights. LaTeX support is provided. \
The fonts are based on URW Palladio and Iwona Condensed, and \
were created using FontForge."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn21326"

RPM_NAME = "texlive-fonetika-2026.226.svn21326-60.2.noarch.rpm"
RPM_HASH = "f27d36e64e516363dafde2b77f932f2ef7c9d507f52001dbdb82fab8f01ed853514a5e063b277090c3922cba06ca6bd8ebe08bb0c8de7231af3af0c3917afca3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fonetika.map \
tex-fonetika.sty \
tex-fonetika.tfm \
tex-fonetikabold.tfm \
tex-fonetikasans.tfm \
tex-fonetikasansbold.tfm \
tex-t1fonetika.fd \
texlive-fonetika"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-fonetika-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
