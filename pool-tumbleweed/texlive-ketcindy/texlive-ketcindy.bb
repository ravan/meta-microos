SUMMARY = "Macros for graphic generation and Cinderella plugin"
DESCRIPTION = "KETpic is a macro package designed for computer algebra systems \
(CAS) to generate LaTeX source codes for high-quality \
mathematical artwork. KETcindy is a plugin for Cinderella that \
allows to generate graphics using KETpic. The generated code \
can be included in any LaTeX document."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.20191225.0svn58661"

RPM_NAME = "texlive-ketcindy-2026.226.20191225.0svn58661-63.2.noarch.rpm"
RPM_HASH = "0a39007dfac3a505d70a2f6bca8d1b9018582bcf55d14d0f1179e75560b0aeecd7454a50f84bf95905604b81b611622f9aa6c2d88c485d0e8d238bc31e84e75a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-KetCindyPlugin.jar \
tex-ketlayer.sty \
tex-ketlayer2e.sty \
tex-ketmedia.sty \
tex-ketpic.sty \
tex-ketpic2e.sty \
tex-ketslide.sty \
tex-ketslide2.sty \
texlive-ketcindy"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
java \
perl-Digest--MD5 \
perl-File--Copy \
perl-strict \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-color.sty \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-ketcindy-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
