SUMMARY = "Store statistics of a document"
DESCRIPTION = "The package counts the numbers of pages per chapter, and stores \
the results in a separate file; the format of the file is \
selectable."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.03svn20334"

RPM_NAME = "texlive-statistik-2026.226.0.0.03svn20334-64.2.noarch.rpm"
RPM_HASH = "5f96b9b104302c4fba7f13b142cd81c900964f95dcd0638618ad6ff791801d890b53d5f210da590375ef7d62bb70dfe9d174a46513393dc6634a86f4cf1799c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-statistik.sty \
texlive-statistik"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
