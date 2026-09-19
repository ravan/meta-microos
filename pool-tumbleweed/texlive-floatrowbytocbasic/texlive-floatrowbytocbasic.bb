SUMMARY = "An enhancement to package floatrow using package tocbasic"
DESCRIPTION = "This package adds usage of package tocbasic to package \
floatrow. This not only improves compatibility with KOMA-Script \
but also adds several new features to floatrow like optional \
automatic entries to the table of contents for the lists of new \
floats, optional numbering of the lists of new floats etc."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn67946"

RPM_NAME = "texlive-floatrowbytocbasic-2026.226.1.0svn67946-60.2.noarch.rpm"
RPM_HASH = "99b7b891d8fd0b873be34723921d5295a823d5a03f0e67cbba460640ef1f0c8089d075e079a956ec5e2d457626c1034873b0368a43bf29f775a3ba2370e9a924"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-floatrowbytocbasic.sty \
texlive-floatrowbytocbasic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-floatrow.sty \
tex-tocbasic.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
