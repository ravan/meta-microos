SUMMARY = "Braces over and under a formula"
DESCRIPTION = "Provides a means to interleave \\overbrace and \\underbrace in \
the same formula."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-oubraces-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "42ae9d64e1e2ca49a02e36d06a464ff5565032abc669a46d7f9505c2b88fb8bb1bdbd2597fa633d4354d106c8ef870259f8ffd6dd8729eb9eed2a14197656715"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-oubraces.sty \
texlive-oubraces"

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
