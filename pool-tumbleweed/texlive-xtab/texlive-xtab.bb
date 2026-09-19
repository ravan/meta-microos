SUMMARY = "Break tables across pages"
DESCRIPTION = "Xtab is an extended and somewhat improved version of \
supertabular; its xtabular environment provides tables that \
break across pages."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3fsvn77682"

RPM_NAME = "texlive-xtab-2026.226.2.3fsvn77682-59.4.noarch.rpm"
RPM_HASH = "50fcb5109cf0bdb97f92a803327a418e17ee7b42bb6a3acb426901a87a130fe8db74b153000b2b91a941fb34fd7f930bc07b8c86ed94e529b24e7b2acf3c1228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xtab.sty \
texlive-xtab"

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
