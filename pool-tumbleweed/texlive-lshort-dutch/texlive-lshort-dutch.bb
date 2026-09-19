SUMMARY = "Introduction to LaTeX in Dutch"
DESCRIPTION = "This is the Dutch (Nederlands) translation of the Short \
Introduction to LaTeX2e."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.3svn15878"

RPM_NAME = "texlive-lshort-dutch-2026.226.1.3svn15878-61.2.noarch.rpm"
RPM_HASH = "70dad68cefecc2fc715954b6c8c35ea919fe3f0c5cc5e04de60a178b71fad7529147d78c0a3bc463dc42be945ae6f11dbd8a0545c653e8b7127ab5b880a57284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-dutch"

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
