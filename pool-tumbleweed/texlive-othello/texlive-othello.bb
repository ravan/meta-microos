SUMMARY = "Modification of a Go package to create othello boards"
DESCRIPTION = "A package (based on Kolodziejska's go), and fonts (as Metafont \
source) are provided."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-othello-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "8ef0bab424f56af5f1852803361d7574900fa824af1cd4d36c2082abc2b542d6a004ce6358b28b0ae82cfb6fb18a6797d2a952d04280af76413a18a01df48522"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ot10.tfm \
tex-ot15.tfm \
tex-ot1bla10.tfm \
tex-ot1bla15.tfm \
tex-ot1bla20.tfm \
tex-ot1neu10.tfm \
tex-ot1neu15.tfm \
tex-ot1neu20.tfm \
tex-ot1whi10.tfm \
tex-ot1whi15.tfm \
tex-ot1whi20.tfm \
tex-othello.sty \
texlive-othello"

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
