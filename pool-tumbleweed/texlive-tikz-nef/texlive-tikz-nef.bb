SUMMARY = "Create diagrams for neural networks constructed with the methods of the Neural Engineering Framework (NEF)"
DESCRIPTION = "The nef TikZ library provides predefined styles and shapes to \
create diagrams for neural networks constructed with the \
methods of the Neural Engineering Framework (NEF). The \
following styles are supported: ea: ensemble array ens: \
ensemble ext: external input or output inhibt: inhibitory \
connection net: network pnode: pass-through node rect: \
rectification ensemble recurrent: recurrent connection"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn55920"

RPM_NAME = "texlive-tikz-nef-2026.226.0.0.1svn55920-59.2.noarch.rpm"
RPM_HASH = "34c248f74a77b73f4e28e22bbbb16dd87a3f9ec6a45c4868875b9cfcda97950ea25d0bf034bc464f476a1a7f1951eeabcdbdfe1943955ab2dbc3e352ddde80e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarynef.code.tex \
texlive-tikz-nef"

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
