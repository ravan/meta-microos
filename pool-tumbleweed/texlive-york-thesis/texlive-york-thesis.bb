SUMMARY = "A thesis class file for York University, Toronto"
DESCRIPTION = "York Graduate Studies has again changed the requirements for \
theses and dissertations. The established york-thesis class \
file now implements the changes made in Spring 2005."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.6svn23348"

RPM_NAME = "texlive-york-thesis-2026.226.3.6svn23348-59.4.noarch.rpm"
RPM_HASH = "8ef4aa25c98b30591714790d9f56c0725d5160e7ce140928774f4dd00d364d3b63d21667cd884ef7e3d85117af399b428b87740f58b171f038fcfe72a9648e7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-york-thesis.cls \
texlive-york-thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-makeidx.sty \
tex-report.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
