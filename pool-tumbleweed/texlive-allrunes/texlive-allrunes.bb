SUMMARY = "Fonts and LaTeX package for almost all runes"
DESCRIPTION = "This large collection of fonts (in Adobe Type 1 format), with \
the LaTeX package gives access to almost all runes ever used in \
Europe. The bundle covers not only the main forms but also a \
lot of varieties."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.1svn42221"

RPM_NAME = "texlive-allrunes-2026.226.2.1.1svn42221-61.2.noarch.rpm"
RPM_HASH = "10116e323f1c984355ae03293ef421b50e9153803f0a3cef6a23596c4a311e233eec6cc23086306781094c66b6d5563199dcd6cdf86a199d709c097e996af4c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-allrunes.map \
tex-allrunes.sty \
tex-ara.fd \
tex-arc.fd \
tex-arl.fd \
tex-arm.fd \
tex-arn.fd \
tex-art.fd \
texlive-allrunes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-updmap.cfg \
texlive \
texlive-allrunes-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
