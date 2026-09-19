SUMMARY = "Classes and packages for formatting documents for FH JOANNEUM"
DESCRIPTION = "This is a collection of classes and packages for the university \
of applied sciences (FH JOANNEUM, Graz, Austria). It is used by \
the institute for applied informatics. Mainly for creation of \
the master thesis and expose. It could be also the base for \
other academic work related to the study programs."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.2csvn78168"

RPM_NAME = "texlive-fhj-script-2026.226.4.2csvn78168-59.2.noarch.rpm"
RPM_HASH = "328f1fbf39eccd8c082bcf8e60bac15df11e67872981ebdfa45128062bb1b5f3dec4d7dbf13cb59360eee37cb7da89713dac970e4c49d08596ab6b1d79af7952"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fhjbook.cls \
tex-fhjcommon.sty \
tex-fhjpaper.cls \
texlive-fhj-script"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-calc.sty \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-scrartcl.cls \
tex-scrbook.cls \
tex-scrlayer-scrpage.sty \
tex-supertabular.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
