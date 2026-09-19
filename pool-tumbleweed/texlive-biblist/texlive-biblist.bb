SUMMARY = "Print a BibTeX database"
DESCRIPTION = "The package provides the means of listing an entire BibTeX \
database, avoiding the potentially large (macro) impact \
associated with \\nocite{*}."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-biblist-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "5391e9435d267c913b19b0bfa29e0395777cc1008b8af73bbc247e5c0844bf8590fb562bd19e451f2da8e2bfddc1f319d2dcebcfa02dccf2d7db85a945b33796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblist.sty \
texlive-biblist"

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
