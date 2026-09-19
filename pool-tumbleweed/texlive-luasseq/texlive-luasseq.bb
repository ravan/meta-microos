SUMMARY = "Drawing spectral sequences in LuaLaTeX"
DESCRIPTION = "The package is an update of the author's sseq package, for use \
with LuaLaTeX. This version uses less memory, and operates \
faster than the original; it also offers several enhancements."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn65511"

RPM_NAME = "texlive-luasseq-2026.226.svn65511-59.2.noarch.rpm"
RPM_HASH = "8ca346e54dad2e5b0a728c61c040b7186ab6412237d5cbe23c46f2fec1dcff3e041c2a824b2e6aeed50c105daf5d9b9b72b2cfe24219a2514dd41f3bfd7ef4e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luasseq.sty \
texlive-luasseq"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-pgf.sty \
tex-pifont.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
