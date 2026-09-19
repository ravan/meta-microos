SUMMARY = "No line breaks in text"
DESCRIPTION = "Use \\nolbreaks{some text} to prevent line breaks in 'some \
text'. This has the advantage over \\mbox{} that glue (rubber \
space) remains flexible. Most common cases are handled here \
(\\linebreak is disabled, for example) but spaces hidden in \
macros or { } can still create break-points."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-nolbreaks-2026.226.1.2svn77682-61.2.noarch.rpm"
RPM_HASH = "967051ab6ba02728ebe0bbbe08fa20ad171c5aea916bf1ee5d4260008f72b6fc0bd7e5fa4b12fc9ad1f4ecf93d0a82b22eec847a7161044e3985b83ee9ced198"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nolbreaks.sty \
texlive-nolbreaks"

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
