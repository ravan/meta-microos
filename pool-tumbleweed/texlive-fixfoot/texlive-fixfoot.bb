SUMMARY = "Multiple use of the same footnote text"
DESCRIPTION = "Provides a \\DeclareFixedFootnote command to provide a single \
command for a frequently-used footnote. The package ensures \
that only one instance of the footnote text appears on each \
page (LaTeX needs to be run several times to achieve this)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3asvn77682"

RPM_NAME = "texlive-fixfoot-2026.226.0.0.3asvn77682-59.2.noarch.rpm"
RPM_HASH = "18eacc1b0e29d746090ed0410efd2adbc4bcdda69c05c369a6a2ab016add332ecb30d312beee51645f208d52b5c80fb4e5743c5639943c63568e22a9a8130fd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fixfoot.sty \
texlive-fixfoot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
