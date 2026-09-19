SUMMARY = "Import and export values of LaTeX registers"
DESCRIPTION = "The package allows the user to export/import the values of \
LaTeX registers (counters, rigid and rubber lengths only). It \
is not for faint-hearted users. The package may be used, for \
example, to communicate between documents for the purposes of \
dvipaste."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8svn27206"

RPM_NAME = "texlive-export-2026.226.1.8svn27206-59.2.noarch.rpm"
RPM_HASH = "ddf8d4a8051aaeea96e4422e68b36ecdf674795a60595d0869fd06ed7c8da555dc4d5230d7d0ecdf12c4dcb94273eb10b066dce31c284ad3be9e3b309968dba9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dvipaste.sty \
tex-export.sty \
texlive-export"

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
