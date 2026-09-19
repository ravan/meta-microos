SUMMARY = "'Scheherazade New' adapted for Persian typesetting and scientific writings"
DESCRIPTION = "This font has been made by editing SIL's 'Scheherazade New', \
making it more suitable for Persian typesetting. (Scheherazade \
New has SIL OFL license.)"
LICENSE = "OFL-1.1"

PV = "2026.226.2.2svn70776"

RPM_NAME = "texlive-parsinevis-2026.226.2.2svn70776-58.2.noarch.rpm"
RPM_HASH = "923c8f732d0a6fb38605f10e702ebd3cf145c180b5eca6ade21343bc95b99a57d10f9dc9765ebe61e6472d372b8d81adf40a2f7bc46e7ecece53c28c19e766b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parsinevis"

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
texlive-parsinevis-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
