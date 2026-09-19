SUMMARY = "Musical fingering diagrams of Pinkullo Huanuqueno, Flute (Recorder), Quena and Saxophone"
DESCRIPTION = "The package provides tools for generating: Pinkullo Huanuqueno \
Flute Quena Saxophone The result will often be a PDF (or set of \
PDFs) that contain everything one will need for musical \
fingering diagrams of the Pinkullo Huanuqueno, Flute, Quena and \
Saxophone. The package uses TikZ for most things and MusixTeX \
for music symbols."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0svn69742"

RPM_NAME = "texlive-undar-digitacion-2026.226.0.0.0svn69742-60.2.noarch.rpm"
RPM_HASH = "391988a68d6c5bb5a74c7d7a8a509ca699db213d8643cf738112186e971b8d7b67da777fbeef16803ce63eeb5012f6300c02f897845a18fd0703839e115734f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-undar-digitacion.sty \
texlive-undar-digitacion"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-musicography.sty \
tex-musixtex.sty \
tex-recorder-fingering.sty \
tex-tikz.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
