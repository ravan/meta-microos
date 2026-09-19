SUMMARY = "Generate sentences in the style of 'Amici miei'"
DESCRIPTION = "This package is an italian blind text generator that outputs \
supercazzole, mocking nonsense phrases from the movie series \
Amici Miei ('My friends'), directed by Mario Monicelli."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8.1svn77161"

RPM_NAME = "texlive-antanilipsum-2026.226.0.0.8.1svn77161-61.2.noarch.rpm"
RPM_HASH = "c5a507a5942a849cc56588c3baafe35c82088ff7ac602189a8617b2d320e5f8c4c3bec95a4ef1db5d8e464f5ccb59937992ed29ead98750e2bae2fbd811bf102"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-antanilipsum.sty \
texlive-antanilipsum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
