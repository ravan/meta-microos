SUMMARY = "A font for the pigpen (or masonic) cipher"
DESCRIPTION = "The Pigpen cipher package provides the font and the necessary \
wrappers (style file, etc.) in order to write Pigpen ciphers, a \
simple substitution cipher. The package provides a font \
(available both as Metafont source, and as an Adobe Type 1 \
file), and macros for its use."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-pigpen-2026.226.0.0.3svn77682-58.2.noarch.rpm"
RPM_HASH = "6b8cc506c7544f761d0c9dd20f91cbf20484eab6e1b9168a0fed1b9ca166b54044860cf0423eeb03233ad8e41c049dc139b1bfd7711567b74ca46f444bcd1d91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pigpen.map \
tex-pigpen.sty \
tex-pigpen.tex \
tex-pigpen.tfm \
texlive-pigpen"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pigpen-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
