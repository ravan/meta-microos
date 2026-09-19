SUMMARY = "Typeset diaries or journals"
DESCRIPTION = "A class, based on scrbook, designed for typesetting diaries, \
journals or devotionals."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn74998"

RPM_NAME = "texlive-scrjrnl-2026.226.0.0.2svn74998-60.2.noarch.rpm"
RPM_HASH = "7bf6004a7292c2168c53335bdf8a48cddebb3d978b2bac3f9a7da1cc4b09141ae661576380fd446ea1145fb4c7b285909ee2ea9a9f31f9ae7680f5706771fb68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scrjrnl.cls \
texlive-scrjrnl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-datetime.sty \
tex-fancytabs.sty \
tex-titlesec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
