SUMMARY = "Insert multilingual placeholder text"
DESCRIPTION = "This is a package to work with multilingual Lorem Ipsum dummy \
texts."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.3svn75788"

RPM_NAME = "texlive-ipsum-2026.226.0.0.1.3svn75788-63.2.noarch.rpm"
RPM_HASH = "a6392fa8d5a9933451dc368bdba1232deab335c543d84050ed6f39976641ea0c329151746b26828abffc6efce2f5ae34f3da775e8f1ca00b8c6d0619276a1eef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ipsum.sty \
texlive-ipsum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-simplekv.sty \
tex-xintexpr.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
