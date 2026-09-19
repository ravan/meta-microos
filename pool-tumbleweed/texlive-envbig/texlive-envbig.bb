SUMMARY = "Printing addresses on envelopes"
DESCRIPTION = "A simple package, that prints both 'from' and 'to' addresses."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-envbig-2026.226.svn15878-61.4.noarch.rpm"
RPM_HASH = "350bc8b5c04424854088ac7012c3580754215da8d904add3894149682f7bd94426f2a5f21db77fc90ca1573a29f8a0534d1be5e5bb7d3c2523fb2f34518a0b6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-envbig.sty \
texlive-envbig"

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
