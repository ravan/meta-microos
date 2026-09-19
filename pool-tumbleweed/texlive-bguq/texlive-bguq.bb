SUMMARY = "Improved quantifier stroke for Begriffsschrift packages"
DESCRIPTION = "The font contains a single character: the Begriffsschrift \
quantifier (in several sizes), as used to set the \
Begriffsschrift (concept notation) of Frege. The font is not \
intended for end users; instead it is expected that it will be \
used by other packages which implement the Begriffsschrift. An \
(unofficial) modified version of Josh Parsons' begriff is \
included as an example of implementation."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn27401"

RPM_NAME = "texlive-bguq-2026.226.0.0.4svn27401-61.2.noarch.rpm"
RPM_HASH = "9c3014d48f27728f7227a853748b234aa0c1a148f82996608cbb6448943bafab56d2d1ed0ac3a8065e422e3424c4ff73416d1ed67a8f5a93036335995c8d2580"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Ubguq04.fd \
tex-Ubguq05.fd \
tex-Ubguq06.fd \
tex-Ubguq07.fd \
tex-Ubguq08.fd \
tex-Ubguq09.fd \
tex-Ubguq10.fd \
tex-Ubguq11.fd \
tex-Ubguq12.fd \
tex-begriff-bguq.sty \
tex-bguq.cfg \
tex-bguq.map \
tex-bguq.sty \
tex-bguq10t04.tfm \
tex-bguq10t05.tfm \
tex-bguq10t06.tfm \
tex-bguq10t07.tfm \
tex-bguq10t08.tfm \
tex-bguq10t09.tfm \
tex-bguq10t10.tfm \
tex-bguq10t11.tfm \
tex-bguq10t12.tfm \
texlive-bguq"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-updmap.cfg \
texlive \
texlive-bguq-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
