SUMMARY = "Indicate the real author of a work"
DESCRIPTION = "This package allows to use a new field 'realauthor', which \
indicates the real author of a work, when published in a \
pseudepigraphic name."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.7.1asvn45865"

RPM_NAME = "texlive-biblatex-realauthor-2026.226.2.7.1asvn45865-61.2.noarch.rpm"
RPM_HASH = "6ffc4bb2ab7bd937b3742510507b44b6c0d187c83dfbfedfb330f6b7e462dfb8cf15e47f39d2756ad63b6a7eda26d6e582f3b5e3d063d50f0ad4983bb3bb1feb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-realauthor.bbx \
texlive-biblatex-realauthor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
