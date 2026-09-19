SUMMARY = "Arbitrary precision numbers implemented by TeX macros"
DESCRIPTION = "The basic operations (addition, subtraction, multiplication, \
division, power to an integer) are implemented by TeX macros in \
this package. Operands may be numbers with arbitrary numbers of \
digits; scientific notation is allowed. The expression scanner \
is also provided. As of version 1.4 (December 2015) the \
calculation of common functions (sqrt, exp, ln, sin, cos, tan, \
asin, acos, atan, pi) with arbitrary precision in the result \
has been added. Exhaustive documentation (including detailed \
TeXnical documentation) is included. The macro includes many \
optimizations and uses only TeX primitives (from classic TeX) \
and \\newcount macro."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.7svn47510"

RPM_NAME = "texlive-apnum-2026.226.1.7svn47510-61.2.noarch.rpm"
RPM_HASH = "306df39ed1ba912744895a3e692c967e10a8f66fe5052aba969e66935a6bdd80fc082193a9d47a284df316415a076b94de84aab15131b20de9f0784ac05a4184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-apnum.tex \
texlive-apnum"

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
