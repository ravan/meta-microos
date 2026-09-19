SUMMARY = "Select pages to be output"
DESCRIPTION = "Defines a command \\outputonly, whose argument is a list of \
pages to be output. With the command present (before \
\\begin{document}), only those pages are output. This package \
was inspired by code published by Knuth in TUGboat 8(2) (July \
1987)."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-selectp-2026.226.1.0svn77682-60.2.noarch.rpm"
RPM_HASH = "720486dbc591d94c7676af49c18b926ca8178a9487e0977225476ac6dba859447f8bcddbae581d1aa09b8dbd76216b3a6c88b4ad57cc768524c515cebba36c8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-selectp.sty \
texlive-selectp"

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
