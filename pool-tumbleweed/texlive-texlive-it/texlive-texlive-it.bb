SUMMARY = "TeX Live manual (Italian)"
DESCRIPTION = "The texlive-it package"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn58653"

RPM_NAME = "texlive-texlive-it-2026.227.svn58653-62.2.noarch.rpm"
RPM_HASH = "ba5778b6384d0385600b4fc6e87f08f8c2e637a1c1fe1e1d49cf53b53c17cec534a80d8a9001a8ba82ecc5b9fcc51b734f2487094fb42283c5a00bc71d4988d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-it"

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
