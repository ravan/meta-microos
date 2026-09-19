SUMMARY = "An enhancement of the setspace package"
DESCRIPTION = "This package adds support for all font sizes, even non-integer \
resp. non-pt sizes to package setspace. This not only improves \
compatibility with KOMA-Script but also corrects the stretch \
value of the usual font sizes."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.04svn76924"

RPM_NAME = "texlive-setspaceenhanced-2026.226.1.04svn76924-60.2.noarch.rpm"
RPM_HASH = "e0d0c79a01709a197ce687fb8c1b747ebb51ba74dce468841cea3e68f03df253710e5ba0659fd5af108cf112ecce02c61ff4bffefc34243154353bacf725c57d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-setspaceenhanced.sty \
texlive-setspaceenhanced"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
