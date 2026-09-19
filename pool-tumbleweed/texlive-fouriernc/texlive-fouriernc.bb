SUMMARY = "Use New Century Schoolbook text with Fourier maths fonts"
DESCRIPTION = "This package provides a LaTeX mathematics font setup for use \
with New Century Schoolbook text. In order to use it you need \
to have the Fourier-GUTenberg fonts installed."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-fouriernc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "87b806306d39c94b0b95e0543c5aaca2431b62d7d66cf5d02ba89113e300ac5a5aacdb15355476711ef4173beb819a4bb2a27ca3c72a2cd4723a5a777dd93a03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fmlfncm.fd \
tex-fmlfncmi.fd \
tex-fmsfncm.fd \
tex-fncmi.tfm \
tex-fncmi.vf \
tex-fncmib.tfm \
tex-fncmib.vf \
tex-fncmii.tfm \
tex-fncmii.vf \
tex-fncmiib.tfm \
tex-fncmiib.vf \
tex-fncsy.tfm \
tex-fncsy.vf \
tex-fouriernc.sty \
tex-t1fnc.fd \
tex-ts1fnc.fd \
texlive-fouriernc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fourier-mcl.tfm \
tex-fourier-ml.tfm \
tex-fourier-mlb.tfm \
tex-fourier-mlit.tfm \
tex-fourier-mlitb.tfm \
tex-fourier-ms.tfm \
tex-fourier.sty \
tex-pncb8r.tfm \
tex-pncbi8r.tfm \
tex-pncr8r.tfm \
tex-pncri8r.tfm \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
