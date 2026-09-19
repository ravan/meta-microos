SUMMARY = "Nested delimiter groups extending over multiple array cells or lines"
DESCRIPTION = "This package provides yet another solution to some well known \
typesetting problems solved in a variety of ways: multi line \
formulas with paired and nested delimiters. It tackles the \
problem at the Lua level, which has some advantages over \
solutions implemented in TeX. In particular, the TeX code need \
not be executed multiple times, and there is no interference \
between TeX grouping and the nesting of delimiter groups. As a \
byproduct, delimiters can be scaled in various ways, inner \
delimiters come in different flavours like relational and \
binary operators, punctuation symbols etc., and outer \
delimiters can be selected automatically according to the \
nesting level. Last but not least, delimiter groups can even \
extend across several array cells or across the whole document. \
A special environment is provided as well, which allows multi \
line expressions to be placed inside a displayed equation and \
make TeX do the line splitting and alignment."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn71709"

RPM_NAME = "texlive-longmath-2026.226.1.0svn71709-61.2.noarch.rpm"
RPM_HASH = "3ecece3197eebbbfd5ea3eb008a24a00b9add43783b312dd6da26654287a4a57cd16c7189f6fb08f5beb1f1301892859918b72b4e820584c11edfe54b9f0f7cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-longmath.sty \
texlive-longmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
