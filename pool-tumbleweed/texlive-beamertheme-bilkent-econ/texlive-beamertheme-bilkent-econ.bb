SUMMARY = "LaTeX Beamer theme for the Department of Economics at Bilkent University"
DESCRIPTION = "This is a LaTeX Beamer theme designed for the Department of \
Economics at Bilkent University. It provides a clean, \
professional presentation style with department-specific \
colors, custom title pages, and consistent slide formatting for \
lectures, seminars, and research talks."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn76561"

RPM_NAME = "texlive-beamertheme-bilkent-econ-2026.226.0.0.1svn76561-61.2.noarch.rpm"
RPM_HASH = "3b0941a35eca54487954a076b0adc99854e23368f9dd0b9dffd7064eb97ff53257a27d705f1bcb0fcd6f50a6f33e9c3c9bd7348ddbaa0a2ed1b19a5c689425a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamertheme-bilkent-econ.sty \
texlive-beamertheme-bilkent-econ"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
