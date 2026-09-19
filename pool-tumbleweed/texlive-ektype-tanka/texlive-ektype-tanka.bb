SUMMARY = "Devanagari fonts by EkType"
DESCRIPTION = "ek-ttaaiip sNsthecyaa kaahii utkRsstt devnaagrii ttNkaaNcaa \
sNgrh. ek-ttaaip sNsthaa ke kii utkRsstt devnaagrii ttNkoN kaa \
sNgrh / . This package provides a collection of some excellent \
Devanagari fonts by EkType: Mukta, Baloo, Modak, and Jaini."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn63255"

RPM_NAME = "texlive-ektype-tanka-2026.226.0.0.2svn63255-61.4.noarch.rpm"
RPM_HASH = "ca1571c45a0677aa6954483e7ded81a9789410712de3137d1f1deba5e09b4d750cd59ef36967c27980bc17b6aa2b2f98c844524ca31aba3435160f9e8386e9a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ektype-tanka"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-ektype-tanka-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
