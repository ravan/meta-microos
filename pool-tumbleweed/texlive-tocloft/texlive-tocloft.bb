SUMMARY = "Control table of contents, figures, etcetera"
DESCRIPTION = "Provides control over the typography of the Table of Contents, \
List of Figures and List of Tables, and the ability to create \
new 'List of ...'. The ToC \\parskip may be changed."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3jsvn77682"

RPM_NAME = "texlive-tocloft-2026.226.2.3jsvn77682-59.2.noarch.rpm"
RPM_HASH = "eaaa0f7503c6f6894e96b76dad6d0e99d8baf1307388ea6c7bc94db2140afc2b6900b1ce9757b75388604834c44ced56dcbe3544118fb270dcccbb0e07724402"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tocloft.sty \
texlive-tocloft"

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
