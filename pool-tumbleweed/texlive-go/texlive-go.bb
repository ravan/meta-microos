SUMMARY = "Fonts and macros for typesetting go games"
DESCRIPTION = "The macros provide for nothing more complicated than the \
standard 19x19 board; the fonts are written in Metafont."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn78101"

RPM_NAME = "texlive-go-2026.226.svn78101-60.4.noarch.rpm"
RPM_HASH = "ea12e269fad9b04a840dae2cf2c1195e6f248452b5e1ca0a4d33c4342ad790ad6818ae5a1cb24a4f1fa476864f396526da6e6e4bdc96a4f52f3151c43175fe28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-go.sty \
tex-go10.tfm \
tex-go15.tfm \
tex-go1bla10.tfm \
tex-go1bla15.tfm \
tex-go1bla20.tfm \
tex-go1whi10.tfm \
tex-go1whi15.tfm \
tex-go1whi20.tfm \
tex-go20.tfm \
tex-go2bla10.tfm \
tex-go2bla15.tfm \
tex-go2bla20.tfm \
tex-go2whi10.tfm \
tex-go2whi15.tfm \
tex-go2whi20.tfm \
tex-gosign50.tfm \
texlive-go"

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
