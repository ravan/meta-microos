SUMMARY = "Prepare special catcodes from token list"
DESCRIPTION = "Allow users to write code that contains tokens with unusual \
catcodes."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.0svn76924"

RPM_NAME = "texlive-precattl-2026.226.0.0.0.0svn76924-59.2.noarch.rpm"
RPM_HASH = "253118cbc18935ed3f14e69c6a25be178095bbeedc93adea850a9a79293bd08adf4a27d11843eeb4692e3dd71c7d88e357f2e1ee1becd70064e52efaab244b61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-precattl.sty \
texlive-precattl"

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
