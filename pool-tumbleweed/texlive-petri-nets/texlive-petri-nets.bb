SUMMARY = "A set TeX/LaTeX packages for drawing Petri nets"
DESCRIPTION = "Petri-nets offers a set of TeX/LaTeX packages about Petri nets \
and related models. Three packages are available: the first \
allows the user to draw Petri-nets in PostScript documents; the \
second defines macros related to PBC, M-nets and B(PN) models; \
and a third that combines the other two."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn39165"

RPM_NAME = "texlive-petri-nets-2026.226.svn39165-58.2.noarch.rpm"
RPM_HASH = "9c01cb1ad0616c7add10c85a769fecc123ab88434b32fd01b0a41fc4a04ac6594291adff9ea44286d67d4a810e8f20ac3d2c38a785c47fc76a74bb465e07299b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pndraw.sty \
tex-pndraw.tex \
tex-pnets.sty \
tex-pnets.tex \
tex-pntext.sty \
tex-pntext.tex \
tex-pnversion.tex \
texlive-petri-nets"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Digest--MD5 \
perl-Getopt--Long \
perl-strict \
sed \
tex-amsfonts.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-petri-nets-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
