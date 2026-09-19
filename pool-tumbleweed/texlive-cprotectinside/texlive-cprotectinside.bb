SUMMARY = "Use cprotect arbitrarily nested"
DESCRIPTION = "This package extends the cprotect package to allow users to use \
verbatim-like commands inside arbitrary parameters."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.0svn76924"

RPM_NAME = "texlive-cprotectinside-2026.226.0.0.0.0svn76924-61.2.noarch.rpm"
RPM_HASH = "f7cceb05756f43b1ecaf0afd0565cabbe8415fc6fdeaf446387872a9612b5eb93f48262350dd3dfed4e92d4d7caadc6fcaf8778f84f8b66b81189fe87909f06f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cprotectinside.sty \
texlive-cprotectinside"

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
