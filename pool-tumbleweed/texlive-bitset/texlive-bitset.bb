SUMMARY = "Handle bit-vector datatype"
DESCRIPTION = "This package defines and implements the data type bit set, a \
vector of bits. The size of the vector may grow dynamically. \
Individual bits can be manipulated."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-bitset-2026.226.1.3svn77682-59.2.noarch.rpm"
RPM_HASH = "b1600ae55ba9bcff3497fe99dda73065ca093e99bf1a3eb0297e3bbbeb8355285c323a7c7f7d80710717719b51f207588cde8ed10639c253cdcf2e5704666146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bitset.sty \
texlive-bitset"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bigintcalc.sty \
tex-infwarerr.sty \
tex-intcalc.sty \
texlive \
texlive-bigintcalc \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
