SUMMARY = "Draw pseudo-3D diagrams of Bloch spheres"
DESCRIPTION = "This package is used to draw pseudo-3D Blochsphere diagrams. It \
supports various annotations, such as great and small circles, \
axes, rotation markings and state vectors. It can be used in a \
standalone fashion, or nested within a tikzpicture environment \
by setting the environment option nested to true."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn38388"

RPM_NAME = "texlive-blochsphere-2026.226.1.1svn38388-59.2.noarch.rpm"
RPM_HASH = "854a0faf04e38feb855f7663a306f7c30ae641605b2d2f82e1f809931d7dd71e101acf24ebb0ce98b6dc8af40038dc78ca3d1941a4e80badbe2a04e94664d02e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-blochsphere.sty \
texlive-blochsphere"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-etoolbox.sty \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
