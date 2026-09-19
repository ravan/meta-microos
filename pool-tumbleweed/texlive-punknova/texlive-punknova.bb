SUMMARY = "OpenType version of Knuth's Punk font"
DESCRIPTION = "The font was generated from a MetaPost version of the sources \
of the 'original' punk font. Knuth's original fonts generated \
different shapes at random. This isn't actually possible in an \
OpenType font; rather, the font contains several variants of \
each glyph, and uses the OpenType randomize function to select \
a variant for each invocation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.003svn24649"

RPM_NAME = "texlive-punknova-2026.226.1.003svn24649-60.4.noarch.rpm"
RPM_HASH = "2db0bcb14558f4cd7ec96cc209e690bdc85d76623c61408e1ae8f5c06a521d9c9c8c5e96dfa3bfd58dcf9e2435a6bfbff0b8e55604514f02ba65a398823c5df8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-punknova"

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
texlive-punknova-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
