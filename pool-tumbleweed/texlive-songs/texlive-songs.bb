SUMMARY = "Produce song books for church or fellowship"
DESCRIPTION = "The package provides a means of producing beautiful song books \
for church or fellowship. It offers: a very easy chord-entry \
syntax; multiple modes (words-only; words+chords; slides; \
handouts); measure bars; guitar tablatures; automatic \
transposition; scripture quotations; multiple indexes (sorted \
by title, author, important lyrics, or scripture references); \
and projector-style output generation, for interactive use. A \
set of example documents is provided."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.1svn51494"

RPM_NAME = "texlive-songs-2026.226.3.1svn51494-64.2.noarch.rpm"
RPM_HASH = "7c40e3c8a502a12acb3de41dd2cb01b1435df699dee81a96ea1b1901b357005e5e39b0a269cbaddc7b73fa0ddc0da08d09b9bfe52dd5e790fbf05defb903de90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-songs.sty \
texlive-songs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-etex.sty \
tex-ifpdf.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
