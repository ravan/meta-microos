SUMMARY = "German translation of tipa documentation"
DESCRIPTION = "This is a translation of Fukui Rei's tipaman from the tipa \
bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn22005"

RPM_NAME = "texlive-tipa-de-2026.226.1.3svn22005-59.2.noarch.rpm"
RPM_HASH = "bab0d6083f2b31ce7f856d4d09a89f04970344ffc7374859fddca4ce259da5e57bdc644006a4226af230e4b96fb9a243b7544e1efdd58a0734440173399a735f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tipa-de"

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
