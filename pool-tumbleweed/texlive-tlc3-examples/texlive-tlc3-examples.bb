SUMMARY = "All examples from 'The LaTeX Companion', third edition"
DESCRIPTION = "The PDFs (as used with spotcolor and trimming) and sources for \
all examples from the third edition (Parts I+II), together with \
necessary supporting files. The edition is published by \
Addison-Wesley, 2023, ISBN-13: 978-0-13-816648-9, ISBN-10: \
0-13-816648-X (bundle of Part I & II)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn65496"

RPM_NAME = "texlive-tlc3-examples-2026.226.svn65496-59.2.noarch.rpm"
RPM_HASH = "9851ad367da46ebf559bbe7320093e9720008d975e416084f4633b1310c795c1d9a008034be0e025103470687833ebc2722bf2dacbc9d868e89dcb699ba7cb44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tlc3-examples"

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
