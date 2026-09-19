SUMMARY = "Time printing, in German"
DESCRIPTION = "The primary goal of this package is to facilitate formats and \
ranges of times as formerly used in Germany. A variety of \
printing formats are available."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2csvn39570"

RPM_NAME = "texlive-uhrzeit-2026.226.0.0.2csvn39570-60.2.noarch.rpm"
RPM_HASH = "c300814a85c22e42a130d34099670d9c7352e9b5415e6a9da262f64dfcd586725276d4f34d9b3714fec9042851deafd3f6078380278d4592cd3f076014d3de05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uhrzeit.sty \
texlive-uhrzeit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-soul.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
