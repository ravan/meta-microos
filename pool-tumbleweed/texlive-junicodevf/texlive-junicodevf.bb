SUMMARY = "A TrueType variable font family for mediaevalists"
DESCRIPTION = "This package supports the Junicode variable fonts for LuaLaTeX. \
The Junicode font is primarily for scholars and students of the \
Middle Ages, but it serves users with a wide variety of \
interests. It tracks the development of the Medieval Unicode \
Font Initiative (MUFI), with its wealth of specialized medieval \
characters, but it also provides many OpenType features that \
allow users to access MUFI characters in accessible ways."
LICENSE = "OFL-1.1"

PV = "2026.226.2.218svn77682"

RPM_NAME = "texlive-junicodevf-2026.226.2.218svn77682-63.2.noarch.rpm"
RPM_HASH = "e795cfcd573b2bd4d9f2108ae86f0df37fdd23571a659d0605facd3e4157d93d2515b682f0e73d1efb8dd9ce0a84db8f6e32ee7e44095dbe4d36e6c4a55ab116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-junicodevf.sty \
texlive-junicodevf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-junicodevf-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
