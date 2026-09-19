SUMMARY = "A math font in the Neo-Hellenic style"
DESCRIPTION = "The GFSNeohellenic font, a historic font first designed by \
Victor Scholderer, and digitized by George Matthiopoulos of the \
Greek Font Society (GFS), now has native support for \
Mathematics. The project was commissioned to GFS by the \
Department of Mathematics of the University of the Aegean, \
Samos, Greece. The Math Table was constructed by the \
Mathematics Professor A. Tsolomitis. A useful application is in \
beamer documents since this is a Sans Math font. The \
GFSNeohellenic fontfamily supports many languages (including \
Greek), and it is distributed (both text and math) under the \
OFL license."
LICENSE = "OFL-1.1"

PV = "2026.226.1.02svn77682"

RPM_NAME = "texlive-gfsneohellenicmath-2026.226.1.02svn77682-60.2.noarch.rpm"
RPM_HASH = "7e64056de92f28979ca56478c25eb64bc3b449d170b71dafd94e222e00772bca9d02b0a8e384e1cfbb7221e4a082134d4ab04d5d0141e37b7577d715ee74d91f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gfsneohellenicot.sty \
texlive-gfsneohellenicmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-unicode-math.sty \
texlive \
texlive-filesystem \
texlive-gfsneohellenicmath-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
