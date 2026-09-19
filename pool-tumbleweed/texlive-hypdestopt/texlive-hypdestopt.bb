SUMMARY = "Hyperref destination optimizer"
DESCRIPTION = "This package supports hyperref's pdfTeX driver. It removes \
unnecessary destinations and shortens the destination names or \
uses numbered destinations to get smaller PDF files."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.9svn77682"

RPM_NAME = "texlive-hypdestopt-2026.226.2.9svn77682-60.2.noarch.rpm"
RPM_HASH = "02c13522359712ca332f65fd3d23b7f0427406a134a1070496ec78f3668c2f62b9b5c13f1ac55ad2226a9ab270e242d66f0b2652ac10715a30b73bc7e24613fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hypdestopt.sty \
texlive-hypdestopt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphalph.sty \
tex-auxhook.sty \
tex-iftex.sty \
tex-pdfescape.sty \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
