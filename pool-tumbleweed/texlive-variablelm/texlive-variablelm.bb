SUMMARY = "Font definitions for the variable Latin Modern fonts"
DESCRIPTION = "This package provides a mechanism for scaling a typeface. It is \
directed at the Latin Modern fonts and provides the font \
definitions and the corresponding style file. This mechanism is \
useful in mixed text compositions, for example Japanese-Latin."
LICENSE = "LPPL-1.3c"

PV = "2026.226.1.2svn60014"

RPM_NAME = "texlive-variablelm-2026.226.1.2svn60014-60.2.noarch.rpm"
RPM_HASH = "2996863c154e794cf240a6d5a3c820b89e1759d99148760adeecca33e2bde0d020bf312852d1f95834e7b7d31913df063ad532932221e4440cdbd0d30c3ea935"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-omlvlmm.fd \
tex-omlvlmr.fd \
tex-omsvlmr.fd \
tex-omsvlmsy.fd \
tex-omxvlmex.fd \
tex-ot1vlmr.fd \
tex-ot1vlmtt.fd \
tex-t1vlmr.fd \
tex-t1vlmss.fd \
tex-t1vlmssq.fd \
tex-t1vlmtt.fd \
tex-t1vlmvtt.fd \
tex-ts1vlmr.fd \
tex-variablelm.sty \
texlive-variablelm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-fontenc.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
