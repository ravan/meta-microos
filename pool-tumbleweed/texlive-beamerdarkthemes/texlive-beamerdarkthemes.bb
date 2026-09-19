SUMMARY = "Dark color themes for beamer"
DESCRIPTION = "A package with three dark color themes for beamer, designed for \
presentations with pictures and/or for bright rooms without \
screen. These themes mix one dominant foreground colour and a \
black background. Cormorant stands for green, frigatebird for \
red and magpie for blue."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.1svn55117"

RPM_NAME = "texlive-beamerdarkthemes-2026.226.0.0.5.1svn55117-61.2.noarch.rpm"
RPM_HASH = "c4e8587e1df2be4793ed9399f4b79f6f2c8dae86adb329dc0e6a3aee1279c5623dd59c0e4ba68b4c292aac8a3cf28401d81ed733cfc3925e1394d2a99c62d9c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemecormorant.sty \
tex-beamercolorthemefrigatebird.sty \
tex-beamercolorthememagpie.sty \
texlive-beamerdarkthemes"

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
