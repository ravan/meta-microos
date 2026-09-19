SUMMARY = "Hyphenation for letterspacing, underlining, and more"
DESCRIPTION = "The package provides hyphenable spacing out (letterspacing), \
underlining, striking out, etc., using the TeX hyphenation \
algorithm to find the proper hyphens automatically. It also \
provides a mechanism that can be used to implement similar \
tasks, that have to treat text syllable by syllable. This is \
shown in two examples. This version is a merge of the original \
soul package from Melchior Franz and the soulutf8 package from \
Heiko Oberdiek and supports also UTF8."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn77682"

RPM_NAME = "texlive-soul-2026.226.3.1svn77682-64.2.noarch.rpm"
RPM_HASH = "d8b25d9a227c259be21782e04fb127ee2c24a24b20fea933c8edcbd0edb798daae25e2532a4e3d2c63541fa48f9afbe6ff53e39e75832513d7bb9a491c08e731"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-soul-ori.sty \
tex-soul.sty \
tex-soulutf8.sty \
texlive-soul"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etexcmds.sty \
tex-infwarerr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
