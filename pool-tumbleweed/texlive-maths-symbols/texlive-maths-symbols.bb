SUMMARY = "Summary of mathematical symbols available in LaTeX"
DESCRIPTION = "A predecessor of the comprehensive symbols list, covering \
mathematical symbols available in standard LaTeX (including the \
AMS symbols, if available at compile time)."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.4svn37763"

RPM_NAME = "texlive-maths-symbols-2026.226.3.4svn37763-59.2.noarch.rpm"
RPM_HASH = "27420c2e074a07e6fb5b09b7f2def0f431a076dc48e0ce7a260e49c4f86ae443075c45b5760cb5b50780e52def04a5d37839949ff0742ee4cdbd2040632da225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-maths-symbols"

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
