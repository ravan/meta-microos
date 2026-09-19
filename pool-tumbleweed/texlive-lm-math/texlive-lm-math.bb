SUMMARY = "OpenType maths fonts for Latin Modern"
DESCRIPTION = "Latin Modern Math is a maths companion for the Latin Modern \
family of fonts, in OpenType format. For use with LuaLaTeX or \
XeLaTeX, support is available from the unicode-math package."
LICENSE = "LPPL-1.3c"

PV = "2026.226.1.959svn67718"

RPM_NAME = "texlive-lm-math-2026.226.1.959svn67718-61.2.noarch.rpm"
RPM_HASH = "c17a811b90fead0c1afcf3886bfda129fdb604fbf6adcb191cbd38236dc69f25c811cd391f08c39d260c87fda70cf3f34885679199a3712b11a6da4ab843f203"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lm-math"

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
texlive-lm-math-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
