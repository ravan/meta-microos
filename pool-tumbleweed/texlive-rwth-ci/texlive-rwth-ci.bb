SUMMARY = "LaTeX templates using CI of RWTH Aachen University"
DESCRIPTION = "The RWTH-CI-Bundle is the official LaTeX bundle of RWTH Aachen \
University to use their Corporate Identity within LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77874"

RPM_NAME = "texlive-rwth-ci-2026.226.1.1svn77874-60.2.noarch.rpm"
RPM_HASH = "30981d3114def7c1afb9e3e4dcf5a858f53020505c530482c35e9551c73e6dea4d51fe88972b0dfd674d73658fb8287d67d21963e7187d0e1382e4467b32caea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeRWTH.sty \
tex-beamerfontthemeRWTH.sty \
tex-beamerinnerthemeRWTH.sty \
tex-beamerouterthemeRWTH.sty \
tex-beamerthemeRWTH.sty \
tex-rwth-beamer.cls \
tex-rwth-colors.sty \
tex-rwth-fonts.sty \
tex-rwth-layout.sty \
tex-rwth-letter.sty \
tex-rwth-lettersize11bp.clo \
tex-rwth-sciposter.cls \
tex-rwthcolors.def \
texlive-rwth-ci"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-anyfontsize.sty \
tex-arimo.sty \
tex-beamer.cls \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-iftex.sty \
tex-qrcode.sty \
tex-scrartcl.cls \
tex-scrlayer-scrpage.sty \
tex-scrletter.sty \
tex-tcolorbox.sty \
tex-trimclip.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
