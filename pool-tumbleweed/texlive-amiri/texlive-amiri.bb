SUMMARY = "A classical Arabic typeface, Naskh style"
DESCRIPTION = "Amiri is a classical Arabic typeface in Naskh style for \
typesetting books and other running text. It is a revival of \
the beautiful typeface pioneered in the early 20th century by \
Bulaq Press in Cairo, also known as Amiria Press, after which \
the font is named. The project aims at the revival of the \
aesthetics and traditions of Arabic typesetting, and adapting \
it to the era of digital typesetting, in a publicly available \
form."
LICENSE = "OFL-1.1"

PV = "2026.226.1.000svn65191"

RPM_NAME = "texlive-amiri-2026.226.1.000svn65191-61.2.noarch.rpm"
RPM_HASH = "9524cf63286ad813da64556443ee161d2684003a5e9231e60e96b4dfc1c4c74cde5b4d07c743b36f6a04f91594d4a0e527be0171513959b19ce78583d1558320"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amiri"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-amiri-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
