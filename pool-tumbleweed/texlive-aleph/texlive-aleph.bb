SUMMARY = "Extended TeX"
DESCRIPTION = "An development of omega, using most of the extensions of TeX \
itself developed for e-TeX."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-aleph-2026.226.svn77830-61.2.noarch.rpm"
RPM_HASH = "d8aa88ca67333f91c484aaece78290cdb41fd4da845c9389a3ac087f292172a39054e617de9707d0e997183b9d9eea23e036249cf86fdafb84cdabaeb49d6e7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-aleph.1 \
texlive-aleph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-aleph-bin \
texlive-cm \
texlive-filesystem \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lambda \
texlive-latex \
texlive-plain \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
