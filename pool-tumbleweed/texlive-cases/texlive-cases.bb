SUMMARY = "Numbered cases environment"
DESCRIPTION = "This package provides a LaTeX environment 'numcases' to produce \
multi-case equations with a separate equation number for each \
case. There is also a 'subnumcases' environment which numbers \
each case with the overall equation number plus a letter [8a, \
8b, etc.]."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2svn77682"

RPM_NAME = "texlive-cases-2026.226.3.2svn77682-59.2.noarch.rpm"
RPM_HASH = "7a0c1b9f99fd424c4ed90082d21f59891560943cb3f2b3fcf90d81d5bee1e1bce59ac5435780f66050bfe2c8f4d79c2e3707b3729aac6c701a649b85eb72330c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cases.sty \
texlive-cases"

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
