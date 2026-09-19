SUMMARY = "Tools for drawing with a cartesian coordinate system"
DESCRIPTION = "The bundle is a set of packages, designed to give mathematics \
teachers (and students) easy access to programming of drawings \
with TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.21csvn69460"

RPM_NAME = "texlive-tkz-base-2026.226.4.21csvn69460-59.2.noarch.rpm"
RPM_HASH = "85caeb251a6f0c7c4f3bf54fa551fbb8f92f3274e6af861087f8529d267ed007a07e1542d82a46b91a30979effb4fc2d16e123dfd5030ad054bc595b8cca2739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tkz-base.cfg \
tex-tkz-base.sty \
tex-tkz-lib-marks.tex \
tex-tkz-lib-shape.tex \
tex-tkz-obj-axes.tex \
tex-tkz-obj-grids.tex \
tex-tkz-obj-marks.tex \
tex-tkz-obj-points.tex \
tex-tkz-obj-rep.tex \
tex-tkz-tools-BB.tex \
tex-tkz-tools-arith.tex \
tex-tkz-tools-base.tex \
tex-tkz-tools-colors.tex \
tex-tkz-tools-misc.tex \
tex-tkz-tools-modules.tex \
tex-tkz-tools-print.tex \
tex-tkz-tools-text.tex \
tex-tkz-tools-utilities.tex \
texlive-tkz-base"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
tex-numprint.sty \
tex-tikz.sty \
tex-xfp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
