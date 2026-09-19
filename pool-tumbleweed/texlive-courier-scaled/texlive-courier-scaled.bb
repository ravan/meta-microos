SUMMARY = "Provides a scaled Courier font"
DESCRIPTION = "This package sets the default typewriter font to Courier with a \
possible scale factor (in the same way as the helvet package \
for Helvetica works for sans serif)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-courier-scaled-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "4960d3a1829f7515639cb4a2546978b9694f8d5317ce32b31682c0190095c1b445b7ebf9019b5603091a806b206e118afc53f6953c3fca24d9fd07aadaab3489"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-8rpcrs.fd \
tex-couriers.sty \
tex-il2pcrs.fd \
tex-ly1pcrs.fd \
tex-omlpcrs.fd \
tex-omspcrs.fd \
tex-ot1pcrs.fd \
tex-t1pcrs.fd \
tex-t5pcrs.fd \
tex-ts1pcrs.fd \
tex-xl2pcrs.fd \
texlive-courier-scaled"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
