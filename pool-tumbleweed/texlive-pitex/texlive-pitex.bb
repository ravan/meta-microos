SUMMARY = "Documentation macros"
DESCRIPTION = "The bundle provides macros that the author uses when writing \
documentation (for example, that of the texapi and yax \
packages). The tools could be used by anyone, but there is no \
documentation, and the macros are subject to change without \
notice."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn24731"

RPM_NAME = "texlive-pitex-2026.226.svn24731-58.2.noarch.rpm"
RPM_HASH = "44ffb6f6414a22549c11e96b774ac4a1c4c2632fd412e81eb3871034feccdb4fd63cc516092a846a0b0640eac619c8f86e830947487a0b61ce6b2483db298ce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pitex.tex \
texlive-pitex"

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
