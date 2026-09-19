SUMMARY = "LaTeX environment for specifying algorithms in a natural way"
DESCRIPTION = "This package provides the environment 'pseudocode' for \
describing algorithms in a natural manner."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn54080"

RPM_NAME = "texlive-pseudocode-2026.226.svn54080-59.2.noarch.rpm"
RPM_HASH = "7ec332c55f2c3a0f210d794b8fc9bc54d5bd98d040a024002604cb7e95aa26af5f39bfd9789008266818d04aa620027e5fff6bedf3467cf97866b305969e5186"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pseudocode.sty \
texlive-pseudocode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancybox.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
