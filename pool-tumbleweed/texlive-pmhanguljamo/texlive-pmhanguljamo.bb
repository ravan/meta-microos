SUMMARY = "Poor man's Hangul Jamo input method"
DESCRIPTION = "This package provides a Hangul transliteration input method \
that allows to typeset Korean letters (Hangul) using the proper \
fonts. The name is derived from 'Poor man's Hangul Jamo Input \
Method'. The use of XeLaTeX is recommended. pdfTeX is not \
supported."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn78114"

RPM_NAME = "texlive-pmhanguljamo-2026.226.1.3svn78114-59.2.noarch.rpm"
RPM_HASH = "4f5a6ce2d430a5dcb1564d72a06e5ad794ef5050b29eabdfc4b22a41038aadd4bdfa2cb95e03ef0cda4104d9e4fcef1c7d4d5ac83ea630ba596db6f49dbbf3c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-frkjamofull.data.tex \
tex-pmhanguljamo-frkim.code.tex \
tex-pmhanguljamo-frkim.sty \
tex-pmhanguljamo-rrk.sty \
tex-pmhanguljamo.sty \
texlive-pmhanguljamo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
