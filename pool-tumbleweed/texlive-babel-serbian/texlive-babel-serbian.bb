SUMMARY = "Babel/Polyglossia support for Serbian"
DESCRIPTION = "The package provides support for Serbian documents written in \
Latin, in babel."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2asvn64571"

RPM_NAME = "texlive-babel-serbian-2026.226.2.2asvn64571-60.2.noarch.rpm"
RPM_HASH = "5858652ce6322193479ba75d787f5785f771e8ed6dbedd8b92656320f9a605d76417be40570285a8c90f69e8822c9b2bf68a58410143437691a46a446c35d208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-serbian.ldf \
texlive-babel-serbian"

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
