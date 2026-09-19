SUMMARY = "Insert Licence Etalab 2.0 logo"
DESCRIPTION = "This package provides commands to display the 'Licence Ouverte \
Etalab 2.0' vector logo: vertical or horizontal version; some \
color choice."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn73069"

RPM_NAME = "texlive-logoetalab-2026.226.0.0.1.1svn73069-61.2.noarch.rpm"
RPM_HASH = "119b0e97e0c9812ba62970b4b7312b364b348c6d156801697e0190588ef38df1b0190ab2c0360716ec8542631041263c024fe36b14c4a6b7ea0bf5442929cb38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-logoetalab.sty \
texlive-logoetalab"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphicx.sty \
tex-simplekv.sty \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
