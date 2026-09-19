SUMMARY = "Subfont numbers for DNP font encoding"
DESCRIPTION = "part of the CJK package, ctan.org/pkg/cjk"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn54074"

RPM_NAME = "texlive-dnp-2026.226.svn54074-59.2.noarch.rpm"
RPM_HASH = "454e5fc9e667de4ff1e0706ba8e76cd9972bd061e6127f9c424a1483dc49b652945b58fb58a2612d2fbca23e93e6440d3a314c4e2dc7ce74eeb6f4878809f9e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dnp"

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
