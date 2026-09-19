SUMMARY = "TeX Live manual (German)"
DESCRIPTION = "The texlive-de package"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn74226"

RPM_NAME = "texlive-texlive-de-2026.227.svn74226-62.2.noarch.rpm"
RPM_HASH = "5eb6f9929246606b4d9ac7c45c09fe69203f543846a4ccfad99473dd59ceea5f630f3e17abc876c0849d27813d89ad98a679d19e9f0bc88dfe2b0d16a5912592"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-de"

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
