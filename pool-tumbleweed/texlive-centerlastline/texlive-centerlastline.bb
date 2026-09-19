SUMMARY = "Paragraphs with last line centered, known as 'Spanish' paragraphs"
DESCRIPTION = "This LaTeX package provides a command \\centerlastline and an \
environment centerlastline that typeset 'Spanish' paragraphs, \
that is paragraphs without indentation, and last line centered, \
useful to finish a large paragraph of text at the end of \
chapters, prologues, etc."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn56644"

RPM_NAME = "texlive-centerlastline-2026.226.1.0svn56644-59.2.noarch.rpm"
RPM_HASH = "7e2ca8b4e4c2485fc5f35da1a0964a3976b3bdae90ea40e3ad6a10a726f8ead1b19af1f879ccdee34969a4d3f1f70b851925714936243c2083d9093f73b8a686"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-centerlastline.sty \
texlive-centerlastline"

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
