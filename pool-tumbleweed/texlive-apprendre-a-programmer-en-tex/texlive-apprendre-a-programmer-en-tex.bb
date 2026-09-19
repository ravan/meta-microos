SUMMARY = "The book 'Apprendre a programmer en TeX'"
DESCRIPTION = "This book explains the basic concepts required for programming \
in TeX and explains the programming methods, providing many \
examples. The package makes the compilable source code as well \
as the compiled pdf file accessible to everyone. Ce livre \
expose les concepts de base requis pour programmer en TeX et \
decrit les methodes de programmation en s'appuyant sur de \
nombreux exemples. Ce package met a disposition de tous le code \
source compilable ainsi que le fichier pdf du livre."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-apprendre-a-programmer-en-tex-2026.226.svn76790-61.2.noarch.rpm"
RPM_HASH = "0b66bb2593bb2bf894355f301471a755935fbf6c5ce8f799e2d19d70d9f1aac1ecf4c4901b00e740c363687c7b2f561ddc04201389e5ff5c0cbc862e6a0ee3de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apprendre-a-programmer-en-tex"

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
