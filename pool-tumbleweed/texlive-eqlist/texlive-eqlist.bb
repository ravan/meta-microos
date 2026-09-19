SUMMARY = "Description lists with equal indentation"
DESCRIPTION = "This package provides a list environment which sets a \
description-like list in which the indentation corresponds to \
the longest item of the list."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn77682"

RPM_NAME = "texlive-eqlist-2026.226.2.1svn77682-61.4.noarch.rpm"
RPM_HASH = "dbd4bc8e6e3e1d27fedcc8e144d23aa78daee025604f603b328b0060c7d808aa157bf133c98cf92dad20d230bb515d355d0ff3ef57df1617e7b5131432a4200d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eqlist.sty \
texlive-eqlist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eqparbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
