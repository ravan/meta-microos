SUMMARY = "Formats a number by inserting commas"
DESCRIPTION = "A flexible package that allows commas (or anything else) to be \
inserted every three digits in a number, as in 1,234."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn18259"

RPM_NAME = "texlive-comma-2026.226.1.2svn18259-60.2.noarch.rpm"
RPM_HASH = "fe3b9590ddb6c1ce63b1b26025ceec9cd12460adcc1f69b7c1a4a44458fa3670b396c1ef71a834411c5dce98c12ac9748694f08d409627ef625573e657778f4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-comma.sty \
texlive-comma"

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
