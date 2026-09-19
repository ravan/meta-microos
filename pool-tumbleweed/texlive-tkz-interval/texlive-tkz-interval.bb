SUMMARY = "Interval brackets made with TikZ"
DESCRIPTION = "The idea is to provide a command for representing intervals \
with brackets created using TikZ, with automatic size \
management and customization of thickness and depth, for \
examples. It is also possible to specify surrounding spaces, \
and optional overlap for open brackets."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0bsvn76924"

RPM_NAME = "texlive-tkz-interval-2026.226.1.0bsvn76924-59.2.noarch.rpm"
RPM_HASH = "4e1d2449dfa8e3cddf76fdc03e8e65afeab165fbf07d96c273357daf1967926410f875d61fcaeed498646f7d6d562a1d63fa54dfaaeac9b0f0f37b95fdedcdd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tkz-interval.sty \
texlive-tkz-interval"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-simplekv.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
