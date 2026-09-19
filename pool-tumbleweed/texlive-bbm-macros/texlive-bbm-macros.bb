SUMMARY = "LaTeX support for 'blackboard-style' cm fonts"
DESCRIPTION = "Provides LaTeX support for Blackboard variants of Computer \
Modern fonts. Declares a font family bbm so you can in \
principle write running text in blackboard bold, and lots of \
math alphabets for using the fonts within maths."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn17224"

RPM_NAME = "texlive-bbm-macros-2026.226.svn17224-61.2.noarch.rpm"
RPM_HASH = "63ac03b1b3c8021a2985e4247c071eee613477b59d8a8c3332c198b339b525c26a73a2ced3f894b3546a9020f1bfa84d549f001f79c05d66a81a607fb2b2a11a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bbm.sty \
tex-ubbm.fd \
tex-ubbmss.fd \
tex-ubbmtt.fd \
texlive-bbm-macros"

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
