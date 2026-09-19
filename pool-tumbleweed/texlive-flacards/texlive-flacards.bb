SUMMARY = "Generate flashcards for printing"
DESCRIPTION = "The flacards class provides an easy interface to produce \
flashcards. It will print several cards per page, on both sides \
of the paper."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.1.1bsvn19440"

RPM_NAME = "texlive-flacards-2026.226.0.0.1.1bsvn19440-59.2.noarch.rpm"
RPM_HASH = "9404104049b78f704799bfee88e2c197f0e3d4a655cacb5b4b50bf7709bb4549cc3d07a08e7e8b36018e0b882b82416208e946faa1cbd09ee44980ae0320c636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-flacards.cls \
texlive-flacards"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-geometry.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
