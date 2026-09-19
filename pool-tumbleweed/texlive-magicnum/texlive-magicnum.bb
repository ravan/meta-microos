SUMMARY = "Access TeX systems' 'magic numbers'"
DESCRIPTION = "This package allows access to the various parameter values in \
TeX (catcode values), e-TeX (group, if and node types, and \
interaction mode), and LuaTeX (pdfliteral mode) by a \
hierarchical name system."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn77682"

RPM_NAME = "texlive-magicnum-2026.226.1.7svn77682-59.2.noarch.rpm"
RPM_HASH = "7114494a7003ccfa3d2c38b878623d6280a11618d44828dd9223585a0ef9f1459f5ee1470b106c521999557165b4dad3b0767e2460135c2fa436140e9d0cffdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-magicnum.sty \
texlive-magicnum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-infwarerr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
