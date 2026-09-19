SUMMARY = "Michael Landy's APA citation style"
DESCRIPTION = "LaTeX and BibTeX style files for a respectably close \
approximation to APA (American Psychological Association) \
citation and reference style."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-mslapa-2026.226.svn76790-61.2.noarch.rpm"
RPM_HASH = "7eddb4ed83655955e58846972d8cd51fb90591645cf915d47a7ac88ef8ebd7dcd9257aa95ff00d1b130acfe6482d2437a48181433bea7192fb8b25a2c377999b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mslapa.sty \
texlive-mslapa"

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
