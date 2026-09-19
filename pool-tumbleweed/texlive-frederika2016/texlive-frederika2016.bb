SUMMARY = "An OpenType Greek calligraphy font"
DESCRIPTION = "Frederika2016 is an attempt to digitize Hermann Zapf's \
Frederika font. The font is the Greek companion of Virtuosa by \
the same designer. This font is a calligraphy font and this is \
an initial release."
LICENSE = "OFL-1.1"

PV = "2026.226.1.000_2016_initial_releasesvn42157"

RPM_NAME = "texlive-frederika2016-2026.226.1.000_2016_initial_releasesvn42157-60.2.noarch.rpm"
RPM_HASH = "4b20de4dbe931296d889962b09d08c2b8b42eca9d5dc22a1bd46c027290617199c15db7bc6289fbc5d2f413bfde9248daf1569c2dbd26dd83fc1f28d173389d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frederika2016"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-frederika2016-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
