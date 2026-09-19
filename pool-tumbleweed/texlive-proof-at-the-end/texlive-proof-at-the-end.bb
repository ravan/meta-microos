SUMMARY = "A package to move proofs to appendix"
DESCRIPTION = "This package aims to provide a way to easily move proofs to the \
appendix. You can (among other things) move proofs to different \
places/sections, create links from theorems to proofs, restate \
theorems, add comments in appendix..."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77355"

RPM_NAME = "texlive-proof-at-the-end-2026.226.svn77355-59.2.noarch.rpm"
RPM_HASH = "4b1ee8b500a63f9928129c4f1838d4b12b857f62a44a1317b10f2cf55724b5894c893fc2eaf5382dc15411e94d04264943879b0ebca88863a22fa617ad658631"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-proof-at-the-end.sty \
texlive-proof-at-the-end"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catchfile.sty \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-kvoptions.sty \
tex-pgfkeys.sty \
tex-thm-restate.sty \
tex-thmtools.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
