SUMMARY = "CJK language support"
DESCRIPTION = "CJK is a macro package for LaTeX, providing simultaneous \
support for various Asian scripts in many encodings (including \
Unicode): Chinese (both traditional and simplified), Japanese, \
Korean and Thai. A special add-on feature is an interface to \
the Emacs editor (cjk-enc.el) which gives simultaneous, \
easy-to-use support to a bunch of other scripts in addition to \
the above -- Cyrillic, Greek, Latin-based scripts, Russian and \
Vietnamese are supported."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.4.8.5svn60833"

RPM_NAME = "texlive-cjkutils-2026.226.4.8.5svn60833-60.2.noarch.rpm"
RPM_HASH = "d8ab75ff9ef7b9cf49bcfd2ff5a266cedc9022d32475ce424518561b38693fee8124f29d9881a7b81b4dc6e4810c7b9ad41825b19ab03bb65a75f16c40a0c898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-b5ka12.cfg \
tex-b5kr12.cfg \
tex-b5so12.cfg \
tex-c1so12.cfg \
tex-c2so12.cfg \
tex-c3so12.cfg \
tex-c4so12.cfg \
tex-c5so12.cfg \
tex-c6so12.cfg \
tex-c7so12.cfg \
tex-csso12.cfg \
tex-gsfs14.cfg \
tex-j2so12.cfg \
tex-jsso12.cfg \
tex-ksso17.cfg \
texlive-cjkutils"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-cjkutils-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
