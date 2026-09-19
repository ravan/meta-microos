SUMMARY = "Specify arbitrary fonts for mathematics in XeTeX"
DESCRIPTION = "The mathspec package provides an interface to typeset \
mathematics in XeLaTeX with arbitrary text fonts using fontspec \
as a backend. The package is under development and later \
versions might to be incompatible with this version, as this \
version is incompatible with earlier versions. The package \
requires at least version 0.9995 of XeTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2bsvn77682"

RPM_NAME = "texlive-mathspec-2026.226.0.0.2bsvn77682-59.2.noarch.rpm"
RPM_HASH = "813fe65a40b9b5aa025b6432127d06564bb896b9e0f0374c0a86911da0879b45239a9c2e142b5929d9dd00ff082377725b000be0e117b925dff683657f0a92d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathspec.sty \
texlive-mathspec"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-MnSymbol.sty \
tex-amstext.sty \
tex-etoolbox.sty \
tex-fontspec.sty \
tex-ifxetex.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
