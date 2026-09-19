SUMMARY = "Pointing hand font"
DESCRIPTION = "Provides right- and left-pointing hands in both black-on-white \
and white-on-black realisation. The font is distributed as \
Metafont source."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn13293"

RPM_NAME = "texlive-hands-2026.226.svn13293-60.4.noarch.rpm"
RPM_HASH = "2dae6e703f67b5e418ff6804764b958c45fb5ff36c194b739720686a5e589547c4f00eba15f10a3424cdebb6dc0998dc61ee80fff390798f1d0dfeed381ba092"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hands.tfm \
texlive-hands"

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
