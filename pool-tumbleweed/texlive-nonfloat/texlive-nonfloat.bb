SUMMARY = "Non-floating table and figure captions"
DESCRIPTION = "Adjusts the figure and table environments to ensure that \
centered objects as one line captions are centered as well. \
Also the vertical spaces for table captions above the table are \
changed."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-nonfloat-2026.226.1.0svn77682-61.2.noarch.rpm"
RPM_HASH = "d9d4026d983eca3e4da6dcf38b17fb06273715d0621669f8171b54f3f4b45bf9001dcd7cf6f6a9368981efffeeb2b54a2ace50b62b660fae8cc2fed5590f624f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nonfloat.sty \
texlive-nonfloat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
