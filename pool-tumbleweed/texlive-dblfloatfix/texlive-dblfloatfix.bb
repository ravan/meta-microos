SUMMARY = "Fixes for twocolumn floats"
DESCRIPTION = "The package solves two problems: floats in a twocolumn document \
come out in the right order and allowed float positions are now \
[tbp]. The package actually merges facilities from fixltx2e and \
stfloats."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn77682"

RPM_NAME = "texlive-dblfloatfix-2026.226.1.0asvn77682-59.2.noarch.rpm"
RPM_HASH = "57c17f1671a2eec3e204da08f3c6ef4ad822b5730e3ea555c1c15767e90547c9349275faa58856a19e79db16e5701efb68549bcd9375f6cf31c502b326bbd721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dblfloatfix.sty \
texlive-dblfloatfix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fixltx2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
