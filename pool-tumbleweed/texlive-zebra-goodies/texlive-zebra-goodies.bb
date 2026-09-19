SUMMARY = "A collection of handy macros for paper writing"
DESCRIPTION = "This package offers a collection of macros to help in the \
process of writing a paper. You may add comments, todo notes, \
etc. during revision, in a colourful way. The package also \
summarizes the inserted notes at the end of the document. There \
are some predefined note commands as well as a way of defining \
new ones to suit the user's needs. You may safely remove this \
package once the paper is finished. This package depends on the \
following other LaTeX packages: kvoptions, manfnt, marginnote, \
tikzpagenodes, xcolor, and, optionally, microtype. Note: \
'zebra' is the name of the package author's lab."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.1svn78163"

RPM_NAME = "texlive-zebra-goodies-2026.226.0.0.9.1svn78163-59.4.noarch.rpm"
RPM_HASH = "5ec04a5dc06cfd59cfd5af76f05fd0f6bea32a8e80fb2f8b6674148b3c4601e7d5a6ec75d4b36ae0e55ce41d2a390258e00d74fa57cb8acd8b34fe93307653ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zebra-goodies.sty \
texlive-zebra-goodies"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-manfnt.sty \
tex-marginnote.sty \
tex-microtype.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
