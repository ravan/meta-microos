SUMMARY = "Notes after every paragraph (or elsewhere)"
DESCRIPTION = "The package provides the \\parnote command. The notes are set as \
(normal) running paragraphs; placement is at the end of each \
paragraph, or manually, using the \\parnotes command."
LICENSE = "LPPL-1.0"

PV = "2026.226.3csvn77682"

RPM_NAME = "texlive-parnotes-2026.226.3csvn77682-58.2.noarch.rpm"
RPM_HASH = "58ab228a43542f86e67fab77c89bdcd07c9a8be52a51d3a209e5ec8bd5c10c2fc42d98f7bc9349541370ef6cc7b81f705227e6e05d92d78741fa2384a7d92cef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-parnotes.sty \
texlive-parnotes"

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
