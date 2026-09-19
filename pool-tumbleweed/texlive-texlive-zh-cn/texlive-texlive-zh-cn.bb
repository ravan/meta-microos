SUMMARY = "TeX Live manual (Chinese)"
DESCRIPTION = "The texlive-zh-cn package"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn78073"

RPM_NAME = "texlive-texlive-zh-cn-2026.227.svn78073-62.2.noarch.rpm"
RPM_HASH = "e3e372d0b326cf9dbde3b9acfa149020f32b27409bfae168ea3cab5da145730b864d826eb368c060a85d1d4d5d5da0b8b222ae4532ebb98c0b94f8049464db19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-zh-cn"

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
