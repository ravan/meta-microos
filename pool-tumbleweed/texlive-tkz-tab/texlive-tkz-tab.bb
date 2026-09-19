SUMMARY = "Tables of signs and variations using PGF/TikZ"
DESCRIPTION = "The package provides comprehensive facilities for preparing \
lists of signs and variations, using PGF. The package \
documentation requires the tkz-doc bundle. This package has \
been taken temporarily out of circulation to give the author \
time to investigate some problems."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.12csvn66115"

RPM_NAME = "texlive-tkz-tab-2026.226.2.12csvn66115-59.2.noarch.rpm"
RPM_HASH = "e0bcf7b22af3e2310ece335c51f1de988aae511fe5b01b03d5c4ec1d1a4c6ac085357046bc808d6b1a37a6bc128f774e050f93ffcc70a31d2a90c8ba5cd1556c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tkz-tab.sty \
texlive-tkz-tab"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
