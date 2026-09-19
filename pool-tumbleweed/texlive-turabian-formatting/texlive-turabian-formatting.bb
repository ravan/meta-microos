SUMMARY = "Formatting based on Turabian's Manual"
DESCRIPTION = "The turabian-formatting package provides Chicago-style \
formatting based on Kate L. Turabian's 'A Manual for Writers of \
Research Papers, Theses, and Dissertations: Chicago Style for \
Students and Researchers' (9th edition)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn58561"

RPM_NAME = "texlive-turabian-formatting-2026.226.svn58561-59.2.noarch.rpm"
RPM_HASH = "e21840e4b642cc2897da8e1a0d6cd9474701268693f73e9571ba3bba5ec2b6c4c86c36e28ed4634d2a2e9d645935f67b886b3c19876e1528638ac5f29436ce55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-turabian-formatting.sty \
tex-turabian-researchpaper.cls \
tex-turabian-thesis.cls \
texlive-turabian-formatting"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-book.cls \
tex-endnotes.sty \
tex-etoolbox.sty \
tex-footmisc.sty \
tex-nowidow.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
