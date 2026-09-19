SUMMARY = "Documentation for texlive-biblatex-abnt"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-abnt"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0svn72565"

RPM_NAME = "texlive-biblatex-abnt-doc-2026.226.4.0svn72565-61.2.noarch.rpm"
RPM_HASH = "0dfec7ca504ba038cb54fa954cd65188b3b12d53d100c57cf364d81829f6398c1d01a14a7880e37bcd30da7b14fe37e6e41d0f5aaf5c496865be3d0faaa4375a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-abnt-doc-pt-BR \
texlive-biblatex-abnt-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
