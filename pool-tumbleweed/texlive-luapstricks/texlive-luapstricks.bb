SUMMARY = "A PSTricks backend for LuaLaTeX"
DESCRIPTION = "This package enables the use of PSTricks directly in LuaLaTeX \
documents, without invoking external programmes, by \
implementing a PostScript interpreter in Lua. Therefore it does \
not require shell escape to be enabled or special environments, \
and instead allows PSTricks to be used exactly like in dvips \
based documents."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn77336"

RPM_NAME = "texlive-luapstricks-2026.226.0.0.11svn77336-59.2.noarch.rpm"
RPM_HASH = "d762d2bba808254d8f0de9285702e8e3bbe04f158a0e255afeb4c189bb75c585c2754ca311438eca3b6d1e80145311e6098ef0b8bf907554b63d25abfd9a6d7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luapstricks"

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
texlive-luapstricks-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
