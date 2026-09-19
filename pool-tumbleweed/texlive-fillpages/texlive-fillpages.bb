SUMMARY = "Fill up the page count to a certain number (e.g. divisible by 4)"
DESCRIPTION = "For printing, the physical page count must be divisible by a \
certain number, most often 4, 8 or 16. This LaTeX package \
inserts blank or predefined pages, if needed."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn73550"

RPM_NAME = "texlive-fillpages-2026.226.1.1.0svn73550-59.2.noarch.rpm"
RPM_HASH = "bab187ecf55d228ffe74eb1b750738a432a777bee8c2365ec75df57ba138454741c268cf4cbfbdd27eeca6e085277612fb3aef7034f874fc08a637cc45f1ea69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fillpages.sty \
texlive-fillpages"

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
