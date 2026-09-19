SUMMARY = "Extension of the bbold package with a Blackboard Bold alphabet"
DESCRIPTION = "Extension of bbold to a package with three weights, of which \
the original is considered as light and the additions as \
regular and bold."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.032svn77682"

RPM_NAME = "texlive-bboldx-2026.226.1.032svn77682-61.2.noarch.rpm"
RPM_HASH = "73ba872459a07a589a383aacdcca24cf67fd2256f252eeae0127b142f61a631d5689e72e1fb6d8021300e29fd9e2a225697f54cc66d2e2f865dc248c528c5684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-BBOLDX-Bold.tfm \
tex-BBOLDX-Regular.tfm \
tex-BBOLDX-Thin.tfm \
tex-Ubboldx.fd \
tex-bboldx.enc \
tex-bboldx.map \
tex-bboldx.sty \
texlive-bboldx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-bboldx-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
