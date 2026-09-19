SUMMARY = "Define your own verbatim-like environment"
DESCRIPTION = "Defines general purpose macro named \\newverbatim to define your \
own verbatim-like environment. It also has a supplementary \
style file varvbtm.sty to provide set of macros for variants of \
verbatim, such as tab emulation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn23996"

RPM_NAME = "texlive-newvbtm-2026.226.1.1svn23996-61.2.noarch.rpm"
RPM_HASH = "7bfa79b2c2621a96803fa67c4e7627850f01ccd342c185530816d7a32065f4f28d688a8ce745f573da5d6f5bcaaf61914ad320684e6c18427e7add50eccf62cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newvbtm.sty \
tex-varvbtm.sty \
texlive-newvbtm"

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
