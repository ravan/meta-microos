SUMMARY = "Quickly define several similar macros"
DESCRIPTION = "Multidef provides a simple way of defining several macros \
having similar definitions."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10svn40637"

RPM_NAME = "texlive-multidef-2026.226.1.10svn40637-61.2.noarch.rpm"
RPM_HASH = "f0cb230f0cf73029fcc9dce2bbb21d0153649857dda3285b253c9162f5d3174988ade7011a91211a23a7cb2666acefd974d7efdfa3095b0fe7af94fcf0b308c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multidef.sty \
texlive-multidef"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-trimspaces.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
