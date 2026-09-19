SUMMARY = "Bibliography styles for German texts"
DESCRIPTION = "A set of bibliography styles that conformt to DIN 1505, and \
match the original BibTeX standard set (plain, unsrt, alpha and \
abbrv), together with a style natdin to work with natbib."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-din1505-2026.226.svn76790-59.2.noarch.rpm"
RPM_HASH = "a7811314033677bea867fb45fb275054db5a7c416a7edb4b73a61b69a3f69b0311269115802c72480d20ad1749d90480c2ac1476d63fc88441fc06927238c682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-din1505"

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
