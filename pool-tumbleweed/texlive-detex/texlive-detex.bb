SUMMARY = "Strip TeX from a source file"
DESCRIPTION = "Detex is a program to remove TeX constructs from a text file. \
It recognizes the \\input command. The program assumes it is \
dealing with LaTeX input if it sees the string \\begin{document} \
in the text. In this case, it also recognizes the \\include and \
\\includeonly commands. The author now considers this program to \
be 'retired' and Piotr Kubowicz's OpenDetex as its successor."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn70015"

RPM_NAME = "texlive-detex-2026.226.svn70015-59.2.noarch.rpm"
RPM_HASH = "db9094d76cf03b6f5602310cc85184aa441e397a1b1cea0880b4e0509dc6a7c49cd8dc95c49b598f932a0b840d29b2517c2a605e2b082b8862ed6e30b612ebc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-detex.1 \
texlive-detex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-detex-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
