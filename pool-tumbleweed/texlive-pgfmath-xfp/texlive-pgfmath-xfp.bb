SUMMARY = "Define pgfmath functions using xfp"
DESCRIPTION = "This package allows to define pgfmath functions that use the \
xfp fpu for their calculations. The input arguments are parsed \
with pgfmath (while the pgf-fpu is locally active), and the \
results are forwarded to xfp's fpu for the function evaluation. \
The result of that calculation is then parsed by pgfmath again \
(with the surrounding settings of pgfmath). This way the \
functions should be usable in every pgfmath context, though \
there is some overhead to this approach. The package is only \
meant as a temporary stopgap until a more dedicated solution is \
available to use xfp in pgf."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn76924"

RPM_NAME = "texlive-pgfmath-xfp-2026.226.1.0asvn76924-58.2.noarch.rpm"
RPM_HASH = "dfee2c09b3c7f3db65db4e8bbdf3ef239ea140ead0da57136a70b22a7c709e8d19e5d49b55c443e1cba75a30d91c71df66daa0b4e9a92ba0c118628cc659eb78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgfmath-xfp.sty \
texlive-pgfmath-xfp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-pgfmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
