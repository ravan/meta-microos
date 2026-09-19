SUMMARY = "BX bundle base components"
DESCRIPTION = "The main purpose of this bundle is to serve as an underlying \
library for other packages created by the same author (their \
names start with 'BX' or 'PX'). However bxbase package contains \
a few user-level commands and is of some use by itself."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn66115"

RPM_NAME = "texlive-bxbase-2026.226.1.2asvn66115-59.2.noarch.rpm"
RPM_HASH = "7925822a5c7a93b221a092c236a0b53758632009f8dd147e43e0f31cba34ff20118118756e0300fadbf763ee1d10ce21efa32b524e2677acd6b03aae5d02d41f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxbase.def \
tex-bxbase.sty \
tex-bxtoolbox-ext.def \
tex-bxtoolbox-ja.def \
tex-bxtoolbox.def \
tex-bxtoolbox.sty \
tex-bxutf8.def \
tex-bxutf8x.def \
tex-zxbase.sty \
texlive-bxbase"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-ifxetex.sty \
tex-keyval.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
