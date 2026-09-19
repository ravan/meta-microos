SUMMARY = "Package for typesetting song lyrics and chord books"
DESCRIPTION = "The package provides an all purpose songbook style. Three types \
of output may be created from a single input file: 'words and \
chords' books for the musicians to play from, 'words only' \
songbooks for the congregation to sing from, and overhead \
transparency masters for congregational use. The package will \
also print a table of contents, an index sorted by title and \
first line, and an index sorted by key, or by artist/composer. \
The package attempts to handle songs in multiple keys, as well \
as songs in multiple languages."
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.4.5svn18136"

RPM_NAME = "texlive-songbook-2026.226.4.5svn18136-64.2.noarch.rpm"
RPM_HASH = "d40cb4b6663925a39f4e1a29e540dbf4e1091d4145898f7eedab175b78d3bbdf4c6c8db995ad9193a461604f06ee0bc8e52aa98eabefa1ec6301512f9d7987cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-conditionals.sty \
tex-songbook.sty \
texlive-songbook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-multicol.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
