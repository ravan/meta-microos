SUMMARY = "TeX Live manual (Polish)"
DESCRIPTION = "The texlive-pl package"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn74803"

RPM_NAME = "texlive-texlive-pl-2026.227.svn74803-62.2.noarch.rpm"
RPM_HASH = "bcbe938e67fc5e874372cbadfb825e4f4367c80511a356d687dc9666a9414bce2b364bfbdfc3d5360776003664f5ce8d6d78132ac438bbe6218038c90b0b7b85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-pl"

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
