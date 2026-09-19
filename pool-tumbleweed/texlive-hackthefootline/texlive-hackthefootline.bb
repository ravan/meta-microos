SUMMARY = "Footline selection and configuration for LaTeX beamer's standard themes"
DESCRIPTION = "This package is taking over, defining and redefining different \
footlines. Configuration is provided via using key-value \
syntax. It depends on the pgfkeys used for providing the \
configuration keys. Optional features require the following \
LaTeX packages: appendixnumberbeamer, calc, etoolbox, and \
numprint."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn46494"

RPM_NAME = "texlive-hackthefootline-2026.226.svn46494-60.4.noarch.rpm"
RPM_HASH = "91c6ef989149c4bacfc9808207604484ef3f59fb18ac6a6bd84237d5df9c8d43649c87f045cc16cfedfa0b48ac4f239aeac8e26e3e71b44958fb1a3b26ada97b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hackthefootline.sty \
texlive-hackthefootline"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-appendixnumberbeamer.sty \
tex-calc.sty \
tex-etoolbox.sty \
tex-ifthen.sty \
tex-numprint.sty \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
