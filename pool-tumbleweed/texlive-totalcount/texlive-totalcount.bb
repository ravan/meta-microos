SUMMARY = "Commands for typesetting total values of counters"
DESCRIPTION = "This LaTeX package offers commands for typesetting total values \
of counters."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn77682"

RPM_NAME = "texlive-totalcount-2026.226.1.0asvn77682-59.2.noarch.rpm"
RPM_HASH = "8bde8c1fe8c221104ec94b354deac7fed4b3e9e3a127e00e5b7bc5b12e55c3eff979415310fd9016349272dadca12387e9db4ea8caf39ec93995189c15e16e34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-totalcount.sty \
texlive-totalcount"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
