SUMMARY = "BibTeX variant supporting Unicode (UTF-8), via ICU"
DESCRIPTION = "An enhanced, portable C version of BibTeX. Unicode is supported \
via the ICU library. Originally written by Yannis Haralambous \
and his students, and derived from bibtex8, with substantial \
updates from the Japanese TeX Development Community, it is now \
maintained as part of TeX Live."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.72svn66186"

RPM_NAME = "texlive-bibtexu-2026.226.3.72svn66186-61.2.noarch.rpm"
RPM_HASH = "c89e54c985db2ed389a6ae98564d4d9d4e1960e08a08ed23f7d91c1f7e7173dd87fa2ff21fa71809ec33c81a6c3338264d2a403f3fa5ef6ed9d711fc3864f78e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-bibtexu.1 \
texlive-bibtexu"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-bibtexu-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
