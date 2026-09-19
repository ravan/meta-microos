SUMMARY = "Constructions with braces to present mathematical demonstrations"
DESCRIPTION = "The LaTeX package cascade provides a command \\Cascade to do \
constructions to present mathematical demonstrations with \
successive braces for the deductions."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn76924"

RPM_NAME = "texlive-cascade-2026.226.1.2asvn76924-59.2.noarch.rpm"
RPM_HASH = "626e47420f015a56ba1b61f05be75cc316c218d8faf0651d03b1ad6a2be1b1793d4535db2a7eb7e001d233bc70acd258d20bdce3936db9f05d0864f6f9f38b35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cascade.sty \
texlive-cascade"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
