SUMMARY = "A font with the images of the counties of Romania"
DESCRIPTION = "This package provides a Type 1 font with images of the 42 \
counties of Romania, constructed using a general method which \
is described in detail in the documentation. The package name \
is an abbreviation of 'judetele Romaniei' (= counties of \
Romania)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn56895"

RPM_NAME = "texlive-rojud-2026.226.1.2svn56895-60.2.noarch.rpm"
RPM_HASH = "a0de0700deb713f69259bcc49c268e775ccf7c34bcc3fae26a2f24d4404027e90b78a24980f280fa993dd87055a70f647c7cf219369df2414f5cd3018351c408"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ot1rojud.fd \
tex-rojud.map \
tex-rojud.sty \
tex-rojud.tfm \
tex-turojud.fd \
texlive-rojud"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-rojud-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
