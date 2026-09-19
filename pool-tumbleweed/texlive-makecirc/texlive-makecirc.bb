SUMMARY = "A MetaPost library for drawing electrical circuit diagrams"
DESCRIPTION = "MakeCirc is a MetaPost library that contains diverse symbols \
for use in circuit diagrams. MakeCirc offers a high quality \
tool, with a simple syntax. MakeCirc is completely integrated \
with LaTeX documents and with other MetaPost drawing/graphic. \
Its output is a PostScript file. MakeCirc only requires (La)TeX \
and MetaPost to work."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-makecirc-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "7cbb5c1558625a3fd4aec4201b7f9de1b566fb48d05b7fb5f0e546ac4df25e8d256dc6234c59c32cb2f9347db182fa06ba52f1b9eca593aedb1d94c5b1e16b8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makecirc"

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
