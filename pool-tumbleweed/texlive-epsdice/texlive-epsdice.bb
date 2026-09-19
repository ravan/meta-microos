SUMMARY = "A scalable dice 'font'"
DESCRIPTION = "The epsdice package defines a single command \\epsdice that \
takes a numeric argument (in the range 1-6), and selects a face \
image from a file that contains each of the 6 possible die \
faces. The graphic file is provided in both Encapsulated \
PostScript and PDF formats."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn15878"

RPM_NAME = "texlive-epsdice-2026.226.2.1svn15878-61.4.noarch.rpm"
RPM_HASH = "df19f9336113d9509a7846d1590b566f216f3ec5f25cb29ae3774e33c350a7bda04183fa4238ea33cafaa3c227fd8b92251bb10c059092f84574c08e7c2a26d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epsdice.cfg \
tex-epsdice.sty \
texlive-epsdice"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
