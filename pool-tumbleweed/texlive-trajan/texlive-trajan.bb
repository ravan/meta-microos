SUMMARY = "Fonts from the Trajan column in Rome"
DESCRIPTION = "Provides fonts (both as Metafont source and in Adobe Type 1 \
format) based on the capitals carved on the Trajan column in \
Rome in 114 AD, together with macros to access the fonts. Many \
typographers think these rank first among the Roman's artistic \
legacy. The font is uppercase letters together with some \
punctuation and analphabetics; no lowercase or digits."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-trajan-2026.226.1.1svn77682-59.2.noarch.rpm"
RPM_HASH = "7e575df734fc6a6f54eaa1c392b36f006b2e4ac7a89c76b9ba03abc697d50f5bdec30e9529c64931908c1f32ae45ceb7659e28473cd1aeee317ee62f627cc507"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t1trjn.fd \
tex-trajan.map \
tex-trajan.sty \
tex-trjnr10.tfm \
tex-trjnsl10.tfm \
texlive-trajan"

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
texlive-scripts \
texlive-scripts-bin \
texlive-trajan-fonts"

inherit rpm
