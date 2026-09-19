SUMMARY = "A modern and elegant Beamer theme"
DESCRIPTION = "A modern and elegant Beamer theme designed for academic and \
professional presentations. It offers customizable footer \
styles (quarter-circle, full bar, classic), decorative elements \
that can be enabled/disabled, and enhanced typography options \
for headers. The theme includes special layouts for code \
listings, section pages, and standout frames. Color scheme can \
be customized through theme options, with support for both main \
and accent colors. The typography system supports both serif \
and sans-serif variants, and provides flexible font styling \
across different elements. Focused on readability and visual \
appeal, Celestia offers a clean and professional look for \
presentations."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn78057"

RPM_NAME = "texlive-beamerthemecelestia-2026.226.1.2.0svn78057-61.2.noarch.rpm"
RPM_HASH = "dc4b1ec9781c67115c822a43427f857836c4527717ebe05660a8d288a76490350582036067e7f9247b7f3dbd5c97a51742b39df814cbe8fcb9b0fe65935f05e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerthemeCelestia.sty \
texlive-beamerthemecelestia"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-XCharter.sty \
tex-babel.sty \
tex-caption.sty \
tex-courier.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-helvet.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-inputenc.sty \
tex-inter.sty \
tex-kvoptions.sty \
tex-libertinust1math.sty \
tex-listings.sty \
tex-mathpazo.sty \
tex-minted.sty \
tex-multicol.sty \
tex-newtxmath.sty \
tex-notomath.sty \
tex-plex-mono.sty \
tex-scalefnt.sty \
tex-silence.sty \
tex-stix2.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-unicode-math.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
