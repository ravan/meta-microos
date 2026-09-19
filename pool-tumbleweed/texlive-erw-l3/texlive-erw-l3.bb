SUMMARY = "Utilities based on LaTeX3"
DESCRIPTION = "Utilities based on LaTeX3. Highlight: \\erw_merge_sort."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.2svn78101"

RPM_NAME = "texlive-erw-l3-2026.226.4.2svn78101-61.4.noarch.rpm"
RPM_HASH = "af5e0b39d2b7e3f2922059cd519a9027e1c98508ce61d921e8187c7419435f900831c3db528bd18d2d0ff03959bf3953042546dcfd65620a15c0820c5ded940b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-erw-l3.sty \
texlive-erw-l3"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-xparse.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
