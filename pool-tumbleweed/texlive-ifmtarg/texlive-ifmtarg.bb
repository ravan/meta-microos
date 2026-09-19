SUMMARY = "If-then-else command for processing potentially empty arguments"
DESCRIPTION = "This package provides a command for the LaTeX programmer for \
testing whether an argument is empty."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2bsvn77682"

RPM_NAME = "texlive-ifmtarg-2026.226.1.2bsvn77682-60.2.noarch.rpm"
RPM_HASH = "66e10d815a7b70b8494d4a8d6fbf3fad8fde916c87bc874ba5fb6164dc637760d1aa791949c22accfac33ae758022810c5b6d076ceb647580806ce7881ba710a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifmtarg.sty \
texlive-ifmtarg"

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
