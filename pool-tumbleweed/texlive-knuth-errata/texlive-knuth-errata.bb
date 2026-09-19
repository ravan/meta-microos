SUMMARY = "Knuth's published errata"
DESCRIPTION = "These files record details of problems reported in Knuth's \
'Computers and Typesetting' series of books, for the Computer \
Modern fonts, and for TeX, Metafont and related programs."
LICENSE = "SUSE-TeX"

PV = "2026.226.svn58682"

RPM_NAME = "texlive-knuth-errata-2026.226.svn58682-63.2.noarch.rpm"
RPM_HASH = "fd2330f52d088b37fa0ba50833dc64240369bc3e6ddbccb2f4bb81e717c404fad05d391a8aa04d7a271b6e775d8cc463e22b7600cb8ef9245184a86426db2825"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-knuth-errata"

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
