SUMMARY = "German version of booktabs"
DESCRIPTION = "This is a 'translation' of the booktabs."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.61803svn21907"

RPM_NAME = "texlive-booktabs-de-2026.226.1.61803svn21907-59.2.noarch.rpm"
RPM_HASH = "7be2462286ff92f7988c3d9c6db867ed3d40ff2938ccd698b2aa469a260cc87306d2102939888e695ddc3c50c18185fbe711189c79640746d44aceb95405bd91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-booktabs-de"

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
