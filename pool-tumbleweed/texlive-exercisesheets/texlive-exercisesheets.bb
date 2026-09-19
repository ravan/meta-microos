SUMMARY = "Typeset exercise sheets for university courses and school classes"
DESCRIPTION = "This LaTeX package provides a way to typeset exercise sheets as \
used in university courses and school classes. It has evolved \
from a set of macros and environments that were finally \
combined into this package. Since version 0.11 it has a regular \
and a beamer mode (selected depending on the documentclass \
used). From version 0.16 on there is an embedded mode that \
allows using exercises in lecture notes etc. without requiring \
page breaks. Since the package includes a loading mechanism for \
exercises from external files, the same exercises can be reused \
in different contexts."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.17svn76924"

RPM_NAME = "texlive-exercisesheets-2026.226.0.0.17svn76924-59.2.noarch.rpm"
RPM_HASH = "043889af120338282f982304717045aae8523c575f6cc14030dbd8c546213ce71f49fdafdca99b2fa71e5a72e77a9393101bee5221e2bc6322819fef3d782eb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exercisesheets.sty \
texlive-exercisesheets"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-catchfile.sty \
tex-currfile.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-ifluatex.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-kvoptions.sty \
tex-pgfkeys.sty \
tex-refcount.sty \
tex-scrlfile.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
