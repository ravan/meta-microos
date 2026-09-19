SUMMARY = "Linguistic examples and glosses, with reference capabilities"
DESCRIPTION = "The package provides macros for typesetting linguistic examples \
and glosses, with a refined mechanism for referencing examples \
and parts of examples. The package can be used with LaTeX using \
the .sty wrapper or with PlainTex."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.1bsvn77682"

RPM_NAME = "texlive-expex-2026.226.5.1bsvn77682-59.2.noarch.rpm"
RPM_HASH = "223f386a67b1d7a829ddbcad8206433e346657153733940eb2a4b349db2374a9d60728b19bb0f6a417e982c7db0f17640fb209d0d5eaf26b16d732b8f986e145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epltxchapno.sty \
tex-epltxfn.sty \
tex-eptexfn.tex \
tex-expex-demo.tex \
tex-expex.sty \
tex-expex.tex \
texlive-expex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
