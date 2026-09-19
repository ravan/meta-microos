SUMMARY = "A mathematical calligraphic font based on rsfs"
DESCRIPTION = "The package provides virtual fonts and LaTeX support files for \
mathematical calligraphic fonts based on the rsfs Adobe Type 1 \
fonts (which must also be present for successful installation, \
with the slant substantially reduced. The output is quite \
similar to that from the Adobe Mathematical Pi script font."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn78101"

RPM_NAME = "texlive-rsfso-2026.226.1.03svn78101-60.2.noarch.rpm"
RPM_HASH = "099109b1dd35c4c1b6081bff958674302ea16c52bf4ae6788c27e1657829776fee879f621f4cbbbd07d3ba6b18dfc8970ce30d2e524cd26077cc21b0927ec755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rrsfso10.tfm \
tex-rrsfso5.tfm \
tex-rrsfso7.tfm \
tex-rsfso.map \
tex-rsfso.sty \
tex-rsfso10.tfm \
tex-rsfso10.vf \
tex-rsfso5.tfm \
tex-rsfso5.vf \
tex-rsfso7.tfm \
tex-rsfso7.vf \
tex-ursfso.fd \
texlive-rsfso"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmr10.tfm \
tex-cmr5.tfm \
tex-cmr7.tfm \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
