SUMMARY = "LaTeX3 backend drivers (dev)"
DESCRIPTION = "This is a pre-release version of the l3backend package. It \
accompanies the pre-testing kernel code (latex-base-dev), and \
is intended for testing by knowledgeable users."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77954"

RPM_NAME = "texlive-l3backend-dev-2026.226.svn77954-63.2.noarch.rpm"
RPM_HASH = "9f7183da97752459ab9e63c45e0761b00574e2ac04a401ffd008598a3cd31faf13b4ac84de635d1aa68b23941f3f2d8abe55da55a23bfa3e07a9ccd1ed05d457"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texdev-l3backend-dvipdfmx.def \
texdev-l3backend-dvips.def \
texdev-l3backend-dvisvgm.def \
texdev-l3backend-luatex.def \
texdev-l3backend-pdftex.def \
texdev-l3backend-xetex.def \
texlive-l3backend-dev"

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
