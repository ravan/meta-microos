SUMMARY = "Kluwer publication support"
DESCRIPTION = "Most likely long obsolete, unfortunately."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn54074"

RPM_NAME = "texlive-kluwer-2026.226.svn54074-63.2.noarch.rpm"
RPM_HASH = "9892a1aea80c10f9606bd65c1644c02c9fffea5d7eec0b2769496a51f87c87edd7c8882ab98e337bc757c2c6257b9a42405cf809d0a32c9242dc31d328460cdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-klu10.clo \
tex-klu105.clo \
tex-klu11.clo \
tex-klu12.clo \
tex-klu9.clo \
tex-klucite.sty \
tex-kluedit.sty \
tex-klufloa.sty \
tex-klulist.sty \
tex-klumac.sty \
tex-klumath.sty \
tex-klumono.sty \
tex-klunote.sty \
tex-kluopen.sty \
tex-klups.sty \
tex-kluref.sty \
tex-klusec.sty \
tex-klut10.clo \
tex-klut11.clo \
tex-klut12.clo \
tex-klut9.clo \
tex-klutab.sty \
tex-kluwer.cls \
texlive-kluwer"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-doc.sty \
tex-fontenc.sty \
tex-mathptm.sty \
tex-textcomp.sty \
tex-wasysym.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
