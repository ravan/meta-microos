SUMMARY = "Upright integral symbols for Computer Modern"
DESCRIPTION = "This package contains various upright integral symbols to match \
the Computer Modern font."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn54735"

RPM_NAME = "texlive-cmupint-2026.226.1.1svn54735-60.2.noarch.rpm"
RPM_HASH = "8e381e3b6daa2dbddc43789d605a068b6b9f7392b2bc540d70d8070974de2203c69165c1f5c9401e4685e92ef22f3c8fae07c0124b1abf751bd383bbaf9f89ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmupint.map \
tex-cmupint.sty \
tex-cmupint.tfm \
tex-ucmupint.fd \
texlive-cmupint"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-cmupint-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
