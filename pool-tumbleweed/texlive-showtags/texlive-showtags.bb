SUMMARY = "Print the tags of bibliography entries"
DESCRIPTION = "Prints the tag right-aligned on each line of the bibliography."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.05svn77682"

RPM_NAME = "texlive-showtags-2026.226.1.05svn77682-60.2.noarch.rpm"
RPM_HASH = "f9acfe6402da123f329e54079cd50ee84ea18f87bf35b4648fd465afdd745439d82d011a926a5049071ebf6964f9304a2ba1c1186c6b962743086251b447c72c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-showtags.sty \
texlive-showtags"

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
