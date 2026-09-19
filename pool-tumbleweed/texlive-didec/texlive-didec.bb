SUMMARY = "Fixed-point arithmetic with two decimal places"
DESCRIPTION = "This package supports fixed-point arithmetic with two decimal \
places (di-decimal) which is typical for financial transactions \
in many currencies. The intended use case is (personal) \
bookkeeping."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn78113"

RPM_NAME = "texlive-didec-2026.226.1.1.1svn78113-59.2.noarch.rpm"
RPM_HASH = "931733e94b3eda4a3d322592ac0dc614dfece47cb231e653c8df0168aea32682e0504889347f6240650b5d40f9073eb3d43b7e5659adca4156b4c3d601063cab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-didec.sty \
texlive-didec"

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
