SUMMARY = "TeX Live manual (English)"
DESCRIPTION = "The texlive-en package"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn78030"

RPM_NAME = "texlive-texlive-en-2026.227.svn78030-62.2.noarch.rpm"
RPM_HASH = "e5711b2c6ab15c883d0d9667398052df9abaae910326fb0a9d0185ddd26050c1d73ee63a48de22de9bacbb351e3ebcf17f56442907bd97da9e97c1e656300b78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-en"

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
