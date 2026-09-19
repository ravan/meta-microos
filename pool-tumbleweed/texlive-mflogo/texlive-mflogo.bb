SUMMARY = "LaTeX support for Metafont logo fonts"
DESCRIPTION = "LaTeX package and font definition file to access the Knuthian \
mflogo fonts described in 'The Metafontbook' and to typeset \
Metafont logos in LaTeX documents."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77682"

RPM_NAME = "texlive-mflogo-2026.226.2.0svn77682-61.2.noarch.rpm"
RPM_HASH = "ab8331b8be15c70445a1d4a0b5be35f8f5af6b447716b57af26dfa0d68262e4fd0f8047f9192431502546c488af80163cb5b90dc961d8664f3031c8379e91ea9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-logosl8.tfm \
tex-mflogo.sty \
tex-ulogo.fd \
texlive-mflogo"

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
