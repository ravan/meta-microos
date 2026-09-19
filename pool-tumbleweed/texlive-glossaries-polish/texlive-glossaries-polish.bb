SUMMARY = "Polish language module for glossaries package"
DESCRIPTION = "Polish language module for the glossaries package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35665"

RPM_NAME = "texlive-glossaries-polish-2026.226.1.0svn35665-60.4.noarch.rpm"
RPM_HASH = "6cdb33be2f968d132cf28ebeff7224b6116317fada2ee468df7efe6167dd5bca0f43ce92a4421f15bd5df4f1ec7e156aa9c2db016dc561ed374fd8c6cd903cf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-polish-noenc.ldf \
tex-glossaries-polish-utf8.ldf \
tex-glossaries-polish.ldf \
texlive-glossaries-polish"

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
