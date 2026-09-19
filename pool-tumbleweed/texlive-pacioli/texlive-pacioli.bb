SUMMARY = "Fonts designed by Fra Luca de Pacioli in 1497"
DESCRIPTION = "Pacioli was a c.15 mathematician, and his font was designed \
according to 'the divine proportion'. The font is uppercase \
letters together with punctuation and some analphabetics; no \
lowercase or digits. The Metafont source is distributed in a \
.dtx file, together with LaTeX support."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-pacioli-2026.226.svn77682-58.2.noarch.rpm"
RPM_HASH = "ffa59172bf2e4fb7b5368b44d1ed84443c406fd9e6c3cdbfca362e8f258f756ac248d3bcc7c2d58c6322d43c3efa63fae843c9205547a86dc08d6edc42d748b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cpcr10.tfm \
tex-cpcsl10.tfm \
tex-ot1cpc.fd \
tex-pacioli.sty \
tex-t1cpc.fd \
texlive-pacioli"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
