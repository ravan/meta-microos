SUMMARY = "Provides a Lua-enhanced versatile \\verb command"
DESCRIPTION = "This package provides a Lua-enhanced command similar to \\verb, \
as well as an environment similar to lstlisting. These can be \
safely used in the arguments of arbitrary commands without \
breaking, and they work correctly in the table of contents and \
indexes. The package also allows the creation of an arbitrary \
number of text-replacement rules and color presets."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.2svn77516"

RPM_NAME = "texlive-kkluaverb-2026.226.2.1.2svn77516-63.2.noarch.rpm"
RPM_HASH = "a9b143422af27ba628bf4cf1a464b2a05327d60bb021da34f7306fa53684a68b2f12d1dbc94969ad10f1bcf1df67e925324c0320ea531a0d013db593a01cda40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-KKluaverb.sty \
texlive-kkluaverb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luacode.sty \
tex-luatexbase.sty \
tex-pgfkeys.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
