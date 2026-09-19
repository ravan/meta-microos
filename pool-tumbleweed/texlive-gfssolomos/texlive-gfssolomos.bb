SUMMARY = "A Greek-alphabet font"
DESCRIPTION = "Solomos is a font which traces its descent from a \
calligraphically-inspired font of the mid-19th century. LaTeX \
support, for use with the LGR encoding only, is provided."
LICENSE = "OFL-1.1"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-gfssolomos-2026.226.1.0svn77682-60.2.noarch.rpm"
RPM_HASH = "2ebb05cf8ed5edb45d720ea5ea5d9e0b0c236a548f8eba24abff8e7e598efc393e47b67eb9a7b3328f5aaf4a20264b79d754dbb04d719f4a79978310165ce4dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gfssolomos.map \
tex-gfssolomos.sty \
tex-gpsolomos.enc \
tex-gsolomos8a.tfm \
tex-gsolomos8a.vf \
tex-gsolomos8r.tfm \
tex-lgrsolomos.fd \
texlive-gfssolomos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-gfssolomos-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
