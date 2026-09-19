SUMMARY = "Components of TeX"
DESCRIPTION = "An introduction to the components and files users of TeX may \
encounter."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn63184"

RPM_NAME = "texlive-components-2026.226.svn63184-60.2.noarch.rpm"
RPM_HASH = "d700680a1ba7a6aff03859062c318c15acc2c96e1cb7d0d7b734569209219c24d8beb23f1d7580382fef153ac5ea9ad6d9e1e9372409c7c648716e17af321a16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-components"

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
