SUMMARY = "Small modifications to math formatting"
DESCRIPTION = "This package optionally modifies four aspects of TeX's \
automatic math formatting to improve typesetting: (1) it adds \
extra space around relation and operation symbols in \
superscripts and subscripts; (2) it removes extra space around \
\\left-\\right delimiter pairs; (3) it adds extra space after \
right delimiters in certain situations; and (4) it forces \\left \
and \\right delimiters to completely cover their contents. Using \
LuaLaTeX is required."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4asvn75161"

RPM_NAME = "texlive-innerscript-2026.226.1.4asvn75161-60.2.noarch.rpm"
RPM_HASH = "a5567f43fb677546d28466bfa0c4a8c38e742919dd622b412a29f9751805b81e25c8152121124f14c88ae7c74c46df8ccf51102b97ddd8adc1113e718f93bba3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-innerscript.sty \
texlive-innerscript"

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
