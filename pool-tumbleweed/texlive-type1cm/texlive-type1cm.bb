SUMMARY = "Arbitrary size font selection in LaTeX"
DESCRIPTION = "LaTeX, by default, restricts the sizes at which you can use its \
default computer modern fonts, to a fixed set of discrete sizes \
(effectively, a set specified by Knuth). The type1cm package \
removes this restriction; this is particularly useful when \
using scalable versions of the cm fonts (Bakoma, or the \
versions from BSR/Y&Y, or True Type versions from Kinch, PCTeX, \
etc.). In fact, since modern distributions will automatically \
generate any bitmap font you might need, type1cm has wider \
application than just those using scaleable versions of the \
fonts. Note that the LaTeX distribution now contains a package \
fix-cm, which performs the task of type1cm, as well as doing \
the same job for T1- and TS1-encoded ec fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78101"

RPM_NAME = "texlive-type1cm-2026.226.svn78101-59.2.noarch.rpm"
RPM_HASH = "8cb383d36a4f1954ab94d836b133a8ce72b7b5ac3e180684fc7f55fbd5fa20c0c910f4f381a0d532305dfe27f361f59cd2419e52e84b378711c9590fbbf05615"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-type1cm.sty \
texlive-type1cm"

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
