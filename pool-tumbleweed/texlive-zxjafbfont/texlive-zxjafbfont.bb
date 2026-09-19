SUMMARY = "Fallback CJK font support for xeCJK"
DESCRIPTION = "The zxjafbfont package"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-zxjafbfont-2026.226.0.0.2svn77682-59.4.noarch.rpm"
RPM_HASH = "eb1c27da1794645536b63e671fa9549e9fff1b3de1eb096ea16a2e321395fa62b42519caafbc8a571ecf3fae77f33b9665592a0cc176109b469b0576903c4d29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zxjafbfont.sty \
texlive-zxjafbfont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xeCJK.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
