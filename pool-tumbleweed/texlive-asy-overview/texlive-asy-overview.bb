SUMMARY = "A brief overview of the Asymptote language for drawing mathematical graphics"
DESCRIPTION = "Asymptote is a programming language for creating mathematical \
graphics. This document gives you a quick overview, \
illustrating with a few familiar Calculus examples. Readers can \
work through it in a couple of hours to get a feel for the \
system's strengths, and if they are interested then go on to a \
full tutorial or the official reference."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn72484"

RPM_NAME = "texlive-asy-overview-2026.226.svn72484-60.2.noarch.rpm"
RPM_HASH = "760ab83197f4ead16eb757a6997fe1f395bf72ff5a64e49bbf1704d3d5e4de5a8765267bd4f88026b30d915502672ea4ddfd180b6d23ba4932e621df4e56fed4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asy-overview"

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
