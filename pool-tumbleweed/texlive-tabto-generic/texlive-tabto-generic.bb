SUMMARY = "'Tab' to a measured position in the line"
DESCRIPTION = "\\tabto{<length>} moves the typesetting position to <length> \
from the left margin of the paragraph. If the typesetting \
position is already further along, \\tabto starts a new line."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2026.227.svn15878"

RPM_NAME = "texlive-tabto-generic-2026.227.svn15878-62.2.noarch.rpm"
RPM_HASH = "0d607e3802f48e6f9d3ef4e2fa6643447a81331b163999705f25162e8f4f06bf34ac64288496acc94347284b3dd0280b9e89a10520ac3a40abaf5aca80302135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabto.tex \
texlive-tabto-generic"

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
