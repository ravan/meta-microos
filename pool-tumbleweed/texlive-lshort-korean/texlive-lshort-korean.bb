SUMMARY = "Korean introduction to LaTeX"
DESCRIPTION = "A translation of Oetiker's original (not so) short \
introduction."
LICENSE = "GFDL-1.3-or-later"

PV = "2026.226.svn73814"

RPM_NAME = "texlive-lshort-korean-2026.226.svn73814-61.2.noarch.rpm"
RPM_HASH = "41dc3613c880356eccd63a028bf7ac7d6fb2d4ad7f8cb3534f3b5f28a525ce0e0dc8a557b15f5dbe0db72dd3ab986953e7c5204803390f3d55cd9401bc962550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-korean"

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
