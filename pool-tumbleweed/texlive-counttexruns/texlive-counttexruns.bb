SUMMARY = "Count compilations of a document"
DESCRIPTION = "The package counts how often a LaTeX document is compiled, \
keeping the data in an external file. To print the count, can \
use the macro \\thecounttexruns."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00asvn27576"

RPM_NAME = "texlive-counttexruns-2026.226.1.00asvn27576-61.2.noarch.rpm"
RPM_HASH = "37075de7a51eba534bf880238dc7b22b5802298626d1eb7ff231116f17ee5200a291372178cf6857e24d5ce89473d8d454175675faed757f292aa641444b258f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-counttexruns.sty \
texlive-counttexruns"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
