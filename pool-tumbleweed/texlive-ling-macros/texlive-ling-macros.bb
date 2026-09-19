SUMMARY = "Macros for typesetting formal linguistics"
DESCRIPTION = "This package contains macros for typesetting glosses and formal \
expressions. It covers a range of subfields in formal \
linguistics."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn42268"

RPM_NAME = "texlive-ling-macros-2026.226.svn42268-61.2.noarch.rpm"
RPM_HASH = "83ce8af34f0c1da056fcca338e77be36e1d23b1991eee576864e3c2f8ceb7dd5aec37cbc8c874f4e4c315d3fb11066da088e111e6b1306af038a6ec5b1119701"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ling-macros.sty \
texlive-ling-macros"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-gb4e.sty \
tex-pbox.sty \
tex-relsize.sty \
tex-stmaryrd.sty \
tex-ulem.sty \
tex-upgreek.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
