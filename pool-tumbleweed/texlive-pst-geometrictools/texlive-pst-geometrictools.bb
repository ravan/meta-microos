SUMMARY = "A PSTricks package to draw geometric tools"
DESCRIPTION = "This PSTricks package facilitates the drawing of protractors, \
rulers, compasses and pencils."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn70953"

RPM_NAME = "texlive-pst-geometrictools-2026.226.1.4svn70953-59.2.noarch.rpm"
RPM_HASH = "b98816768458ab2f4bddf52961b5a0a9605ef41c532c5655846538e6631eadc48d035536b1a6bb384d1296511165cd545bc2412f273ec5451494b24f75f263a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-geometrictools.sty \
tex-pst-geometrictools.tex \
texlive-pst-geometrictools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
