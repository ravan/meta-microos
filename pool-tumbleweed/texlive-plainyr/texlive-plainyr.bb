SUMMARY = "Plain bibliography style, sorted by year first"
DESCRIPTION = "This is a version of the standard plain BibTeX style, modified \
to sort chronologically (by year) first, then by author, title, \
etc. (The style's name isn't what the author submitted: it was \
renamed for clarity.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-plainyr-2026.226.svn76790-58.2.noarch.rpm"
RPM_HASH = "d36f76e833202ebf7fbd285f27df34b7202ac195a94e35d37b002723e94cfbd618056def0d3633d2d01b3bf55d5b1661ca20b3cbdd57287d4773a2815b0c2cfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plainyr"

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
