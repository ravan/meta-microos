SUMMARY = "Replacing inputenc for use in LuaTeX"
DESCRIPTION = "LuaTeX operates by default in UTF-8 input; thus LaTeX documents \
that need 8-bit character-sets need special treatment. (In \
fact, LaTeX documents using UTF-8 with 'traditional' -- \
256-glyph -- fonts also need support from this package.) The \
package, therefore, replaces the LaTeX standard inputenc for \
use under LuaTeX. With a current LuaTeX, the package has the \
same behaviour with LuaTeX as inputenc has under pdfTeX."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.973svn77682"

RPM_NAME = "texlive-luainputenc-2026.226.0.0.973svn77682-59.2.noarch.rpm"
RPM_HASH = "9a67525019e81ed4428b1d6d043a79de1b39a1d61ef7c1ef8e3d7838e43f9fd0afe385d1192dfa84701965d96e9ea7d7ade2b26698fed29d22e98e70092a1074"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luainputenc.sty \
tex-lutf8.def \
tex-lutf8x.def \
texlive-luainputenc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
