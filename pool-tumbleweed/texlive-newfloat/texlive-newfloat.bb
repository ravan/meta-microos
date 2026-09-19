SUMMARY = "Define new floating environments"
DESCRIPTION = "The package offers the command \\DeclareFloatingEnvironment, \
which the user may use to define new floating environments \
which behave like the LaTeX standard floating environments \
figure and table."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-newfloat-2026.226.1.2svn77682-61.2.noarch.rpm"
RPM_HASH = "438234675ac20ecea6d73442f8b7117f6c4b9e780d4e39fafc0089802599c0d7cd24cc6cccfa407e264be08577415581cc1f55241e2f44dd55c74eb9f3b7842a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newfloat-v1.0.sty \
tex-newfloat-v1.1.sty \
tex-newfloat.sty \
texlive-newfloat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
