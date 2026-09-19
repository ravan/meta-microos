SUMMARY = "A theme for the beamer class"
DESCRIPTION = "This package provides the 'Verona' theme for the beamer class \
by Till Tantau."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn39180"

RPM_NAME = "texlive-beamer-verona-2026.226.0.0.2svn39180-61.2.noarch.rpm"
RPM_HASH = "f4f87d1b444dec02c3e000fa8e61d2fa7740793747ae098dee1aca45d16df4f8cfe58166e01e67b29d3987593894a4bc89dce8e36dd70fa14d4ef8f43eed698a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerthemeVerona.sty \
texlive-beamer-verona"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tcolorbox.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
