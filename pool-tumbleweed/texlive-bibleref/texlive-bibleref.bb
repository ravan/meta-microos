SUMMARY = "Format bible citations"
DESCRIPTION = "The bibleref package offers consistent formatting of references \
to parts of the Christian bible, in a number of well-defined \
formats. It depends on ifthen, fmtcount, and amsgen."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.26.0svn75257"

RPM_NAME = "texlive-bibleref-2026.226.1.26.0svn75257-61.2.noarch.rpm"
RPM_HASH = "8e49c26e2de24ff9989ff32e8c5be64608d7178bee9e9b7cf4476e28b2f63be528efe7fe90210e25514bce3225663d4ebe6a2d796e9538cead3c9ed6f8f2ff4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibleref-xidx.sty \
tex-bibleref.sty \
texlive-bibleref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsgen.sty \
tex-fmtcount.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
