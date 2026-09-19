SUMMARY = "Semi-automatic grid typesetting"
DESCRIPTION = "returntogrid offers a few commands to get something like an \
simple, semi-automatic grid typesetting. It does more or less \
what the existing gridset package does. The main differences to \
gridset are that returntogrid works also with LuaLaTeX and that \
it has also a command to do some horizontal movements to get to \
'tab' positions."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn48485"

RPM_NAME = "texlive-returntogrid-2026.226.0.0.2svn48485-60.4.noarch.rpm"
RPM_HASH = "f7faf6e60810f20d03f2f1c6f77e44602fc2597eb92e0a0bc03819b44c53e5158076e2dba002e461f55fcaa9647436dbccc65e21990e4264bf3503f6023968c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-returntogrid.sty \
texlive-returntogrid"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eso-pic.sty \
tex-xparse.sty \
tex-zref-abspage.sty \
tex-zref-savepos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
