SUMMARY = "Print chord grids for pop/jazz tunes"
DESCRIPTION = "This Tikz-based music-related package is targeted at pop/jazz \
guitar/bass/piano musicians. They usually need only the chords \
and the song structure. This package produces rectangular song \
patterns with 'one square per bar', with the chord shown inside \
the square. It also handles the song structure by showing the \
bar count and the repetitions of the patterns."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.2svn70392"

RPM_NAME = "texlive-chordbars-2026.226.1.3.2svn70392-60.2.noarch.rpm"
RPM_HASH = "3fcf9cb938b29c63116d019f37f7163c38ea6b4896afe34c1847b2fdfc7f10e1c973b2ca3433dedc5dca4a7ae97cc2194d1b4abacafad5b36ebe1a75e4ab3ea8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chordbars.sty \
texlive-chordbars"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-pgfmath.sty \
tex-relsize.sty \
tex-tikz.sty \
tex-tkz-euclide.sty \
tex-wasysym.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
