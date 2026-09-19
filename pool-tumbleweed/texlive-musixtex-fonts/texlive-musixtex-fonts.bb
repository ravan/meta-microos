SUMMARY = "Fonts used by MusixTeX"
DESCRIPTION = "These are fonts for use with MusixTeX; they are provided both \
as original Metafont source, and as converted Adobe Type 1. The \
bundle renders the older (Type 1 fonts only) bundle \
musixtex-t1fonts obsolete."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn65517"

RPM_NAME = "texlive-musixtex-fonts-2026.226.svn65517-61.2.noarch.rpm"
RPM_HASH = "30b370de2038b28f7b43d717caca1e02b57917a45e1970dcbfcc7bb24d2fbab3e643682e81a30e6f2602cb0c43b6d79f9dfcaa76c78254b67d7a845df53ae692"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-MuseJazzText.tfm \
tex-feta20.tfm \
tex-frenchtab.tfm \
tex-musix.map \
tex-musix11.tfm \
tex-musix13.tfm \
tex-musix16.tfm \
tex-musix20.tfm \
tex-musix24.tfm \
tex-musix25.tfm \
tex-musix29.tfm \
tex-musixsps.tfm \
tex-musixspx.tfm \
tex-mxsk.tfm \
tex-xadf11.tfm \
tex-xadf13.tfm \
tex-xadf16.tfm \
tex-xadf20.tfm \
tex-xadf24.tfm \
tex-xadf29.tfm \
tex-xgreg11.tfm \
tex-xgreg13.tfm \
tex-xgreg16.tfm \
tex-xgreg20.tfm \
tex-xgreg24.tfm \
tex-xgreg29.tfm \
tex-xppff10.tfm \
tex-xsld11.tfm \
tex-xsld11d.tfm \
tex-xsld13.tfm \
tex-xsld13d.tfm \
tex-xsld16.tfm \
tex-xsld16d.tfm \
tex-xsld20.tfm \
tex-xsld20d.tfm \
tex-xsld24.tfm \
tex-xsld24d.tfm \
tex-xsld29.tfm \
tex-xsld29d.tfm \
tex-xsldd20.tfm \
tex-xsldu20.tfm \
tex-xslhd11.tfm \
tex-xslhd11d.tfm \
tex-xslhd13.tfm \
tex-xslhd13d.tfm \
tex-xslhd16.tfm \
tex-xslhd16d.tfm \
tex-xslhd20.tfm \
tex-xslhd20d.tfm \
tex-xslhd24.tfm \
tex-xslhd24d.tfm \
tex-xslhd29.tfm \
tex-xslhd29d.tfm \
tex-xslhu11.tfm \
tex-xslhu11d.tfm \
tex-xslhu13.tfm \
tex-xslhu13d.tfm \
tex-xslhu16.tfm \
tex-xslhu16d.tfm \
tex-xslhu20.tfm \
tex-xslhu20d.tfm \
tex-xslhu20m.tfm \
tex-xslhu24.tfm \
tex-xslhu24d.tfm \
tex-xslhu29.tfm \
tex-xslhu29d.tfm \
tex-xslhz20.tfm \
tex-xslhz20d.tfm \
tex-xslu11.tfm \
tex-xslu11d.tfm \
tex-xslu13.tfm \
tex-xslu13d.tfm \
tex-xslu16.tfm \
tex-xslu16d.tfm \
tex-xslu20.tfm \
tex-xslu20d.tfm \
tex-xslu24.tfm \
tex-xslu24d.tfm \
tex-xslu29.tfm \
tex-xslu29d.tfm \
tex-xslud20.tfm \
tex-xslup20.tfm \
tex-xslz20.tfm \
tex-xslz20d.tfm \
tex-xtie20.tfm \
texlive-musixtex-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-musixtex-fonts-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
