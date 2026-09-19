SUMMARY = "A DVI previewer for the X Window System"
DESCRIPTION = "The canonical previewer for use on Unix and other X-windows \
based systems. The distribution has been integrated with that \
of xdvik (no longer separately available), so that it will \
build with web2c 'out of the box'. It is included in TeX Live."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn62387"

RPM_NAME = "texlive-xdvi-2026.226.svn62387-59.4.noarch.rpm"
RPM_HASH = "8b51ca3aa190d8be4d96307c7550e3cbf57d463742f1c3540207354d66805efa9ac04106d3123792a64395cb97f8fb40c3f33fb57a69828b8617e1bb4f675c17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-xdvi \
texlive-xdvi"

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
texlive-scripts-bin \
texlive-xdvi-bin"

inherit rpm
