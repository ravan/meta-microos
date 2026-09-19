SUMMARY = "Add a custom symbol at the end of an environment"
DESCRIPTION = "This package allows adding a custom symbol at the end of an \
environment (e.g. theorems, definitions, remarks)."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.2svn62164"

RPM_NAME = "texlive-atendofenv-2026.226.0.0.2svn62164-60.2.noarch.rpm"
RPM_HASH = "92025750aa55bf7f7569cd1f6a1e2e48127f935c5de6bf962e305e3495f250f063d953763f759c06cedd00c8db1835d8440960733e8d05b26002184358caecd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-atendofenv.sty \
texlive-atendofenv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsthm.sty \
tex-letltxmacro.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
