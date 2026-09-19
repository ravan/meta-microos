SUMMARY = "Visual help for PSTricks based on images with minimum text"
DESCRIPTION = "Visual help for PSTricks based on images with minimum text. One \
image per command or per parameter."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.3svn39799"

RPM_NAME = "texlive-visualpstricks-2026.226.2.3svn39799-60.2.noarch.rpm"
RPM_HASH = "fb0c5a9da497087e5b8433317ccb3c40d819e4bab454d954a1ba3185c9814bfdd368da5c719566d1553c546b1755b2004e5b01151be18b56e99649f60ece7fe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-visualpstricks"

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
