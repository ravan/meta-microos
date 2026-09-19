SUMMARY = "A simplified documentation for tlmgr"
DESCRIPTION = "This package provides simplified documentation for tlmgr, the \
TeX Live Manager. It describes the most commonly-used actions \
and options in a convenient format."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn75236"

RPM_NAME = "texlive-tlmgrbasics-2026.226.svn75236-59.2.noarch.rpm"
RPM_HASH = "02e2ac0fee2a1fab130c1c6b34505d504eb0aecc13ac177c067bece2fe99e63eb39324fc20836ec53c48e2b5db7e7b1b3b60ed0bf9d195ded0ef287cc7e4faae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tlmgrbasics"

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
