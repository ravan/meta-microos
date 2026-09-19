SUMMARY = "Beautiful in-line microtonal just intonation accidentals"
DESCRIPTION = "The Helmholtz-Ellis JI Pitch Notation (HEJI), devised in the \
early 2000s by Marc Sabat and Wolfgang von Schweinitz, \
explicitly notates the raising and lowering of the untempered \
diatonic Pythagorean notes by specific microtonal ratios \
defined for each prime. It provides visually distinctive \
'logos' distinguishing families of justly tuned intervals that \
relate to the harmonic series. These take the form of strings \
of additional accidental symbols based on historical \
precedents, extending the traditional sharps and flats. Since \
its 2020 update, HEJI ver. 2 ('HEJI2') provides unique \
microtonal symbols through the 47-limit. This package is a \
simple LaTeX implementation of HEJI2 that allows for in-line \
typesetting of microtonal accidentals for use within \
theoretical texts, program notes, symbol legends, etc. \
Documents must be compiled using XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn55213"

RPM_NAME = "texlive-helmholtz-ellis-ji-notation-2026.226.1.1svn55213-60.4.noarch.rpm"
RPM_HASH = "4a957308788fe2f33ca6da7d4a551c86a0bc901d891a36dc53bda1cbc868ae735d6afb0f67308ede53def706902397dab74f306a6843023f8befae4027b947d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-helmholtz-ellis-ji-notation.sty \
texlive-helmholtz-ellis-ji-notation"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
texlive \
texlive-filesystem \
texlive-helmholtz-ellis-ji-notation-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
