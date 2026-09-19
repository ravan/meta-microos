SUMMARY = "Reduce size of PostScript files by not repeating images"
DESCRIPTION = "The package is an extension of the standard latex-graphics \
bundle and provides a way to include repeated PostScript \
graphics (ps, eps) only once in a PostScript document. This \
leads to smaller PostScript documents when having, for \
instance, a logo on every page. The package only works when \
post-processed with dvips, which should be version 5.95b or \
later. The difference for a resulting distilled PDF file is \
minimal (as Ghostscript and Adobe Distiller only include a \
single copy of each graphics file, anyway)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn56931"

RPM_NAME = "texlive-graphicx-psmin-2026.226.1.2svn56931-60.4.noarch.rpm"
RPM_HASH = "0e60d7aa9af78194b4db6696226ae08b53b73ef4703d920d8d3c1a8296bdb15638bb3a91f231913035ea75b1703df1b41ee54ae0394928e9cf7f94db7377c1be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-graphicx-psmin.sty \
texlive-graphicx-psmin"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
