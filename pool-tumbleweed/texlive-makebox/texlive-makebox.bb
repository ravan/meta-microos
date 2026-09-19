SUMMARY = "Defines a \\makebox* command"
DESCRIPTION = "Define a \\makebox* command that does the same as a \\makebox \
command, except that the width is given by a sample text \
instead of an explicit length measure."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn77682"

RPM_NAME = "texlive-makebox-2026.226.0.0.1svn77682-59.2.noarch.rpm"
RPM_HASH = "273b0d89f66734f168daadbbd3a7a0f4dc6173a25b9747047fe0b7096ae047d92bad5d86f067b1ab108e62fdfd19875dd8f97d2dd270b0e43eda5419cb25689e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makebox.sty \
texlive-makebox"

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
