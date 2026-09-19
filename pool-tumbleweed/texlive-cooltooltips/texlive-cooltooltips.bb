SUMMARY = "Associate a pop-up window and tooltip with PDF hyperlinks"
DESCRIPTION = "The cooltooltips package enables a document to contain \
hyperlinks that pop up a brief tooltip when the mouse moves \
over them and also open a small window containing additional \
text. cooltooltips provides the mechanism used by the Visual \
LaTeX FAQ to indicate the question that each hyperlink answers."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn60201"

RPM_NAME = "texlive-cooltooltips-2026.226.1.1svn60201-61.2.noarch.rpm"
RPM_HASH = "f71ecb450c3dc66f0330f9055c92b4d7c1d3e02aedbb07d5a3ec1128f0096bf4128be1b00c87274d57842a77bf72d11d39922213cb5fce23f37c0683fbca5bdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cooltooltips.sty \
texlive-cooltooltips"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-luatex85.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
