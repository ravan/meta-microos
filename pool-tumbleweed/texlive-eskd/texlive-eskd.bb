SUMMARY = "Modern Russian typesetting"
DESCRIPTION = "The class offers modern Russian text formatting, in accordance \
with accepted design standards. Fonts not (apparently) \
available on CTAN are required for use of the class."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-eskd-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "07b279f7ea70f4e751007e7fa9474ef72ec49a3bce4d9a04d19ac62e1ffb5bd388bf929812c20c08820dd6517d9b2c672efa14a9d1137c39b3d00d50877c37f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eskd.cls \
texlive-eskd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-babel.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-keyval.sty \
tex-lastpage.sty \
tex-rotating.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
