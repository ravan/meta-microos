SUMMARY = "Tree macros using XY-Pic"
DESCRIPTION = "The package provides means to draw linguistic syntactic trees \
with ease and to support hopefully sufficient functionalities, \
that the linguist may need. The package (of course) depends on \
the XY-Pic package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn15878"

RPM_NAME = "texlive-xytree-2026.226.1.5svn15878-59.4.noarch.rpm"
RPM_HASH = "e96f0a10a16cb4d3b6224a8aad2c02f1aa27e110b283302c3256e3816f06968841b2333e5c6cbdfd91129aff67e45aa084b7fc292989af98d8b967b1fcbc9ada"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xytree.sty \
texlive-xytree"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xy.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
