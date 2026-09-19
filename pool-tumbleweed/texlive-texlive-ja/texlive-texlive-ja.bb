SUMMARY = "TeX Live manual (Japanese)"
DESCRIPTION = "The texlive-ja package"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn74739"

RPM_NAME = "texlive-texlive-ja-2026.227.svn74739-62.2.noarch.rpm"
RPM_HASH = "2c3f11be86b36ba177db5ae11c29cb7a5e37cc1607248b1b8e219c931e6ea3c073b251dffcbf1174a003abd4e63d8f2dd98888f4fe682ad5d3785c09c788ac56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-ja"

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
