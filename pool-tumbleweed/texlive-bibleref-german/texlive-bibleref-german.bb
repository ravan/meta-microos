SUMMARY = "German adaptation of bibleref"
DESCRIPTION = "The package provides translations and various formats for the \
use of bibleref in German documents. The German naming of the \
bible books complies with the 'Loccumer Richtlinien' (Locum \
guidelines). In addition, the Vulgate (Latin bible) is \
supported."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn21923"

RPM_NAME = "texlive-bibleref-german-2026.226.1.0asvn21923-61.2.noarch.rpm"
RPM_HASH = "c3d6bb404f9967c4380afff46a21cc91d3983bcd0f203176a79a95ca0845de85a5d580b9414a9018fb444e9bfbc857d71fa5ce362485dd7f413d6ea841461370"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibleref-german.sty \
texlive-bibleref-german"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bibleref.sty \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
