SUMMARY = "Air Force Institute of Technology thesis class"
DESCRIPTION = "LaTeX thesis/dissertation class for US Air Force Institute Of \
Technology."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.7svn15878"

RPM_NAME = "texlive-afthesis-2026.226.2.7svn15878-61.2.noarch.rpm"
RPM_HASH = "27ae63bb7251f0413226e0f4e7d9d6478bed384d2465cd25e642d5536507e712434011909d9a67afc19859ea102a2b0ff6de0e0bf98f24f3028a0e77cc5b7463"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-afthes10.sty \
tex-afthes11.sty \
tex-afthes12.sty \
tex-afthesis.cls \
tex-afthesis.sty \
texlive-afthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption2.sty \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
