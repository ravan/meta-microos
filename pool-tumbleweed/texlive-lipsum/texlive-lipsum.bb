SUMMARY = "Easy access to the Lorem Ipsum and other dummy texts"
DESCRIPTION = "This package gives you easy access to 150 paragraphs of the \
Lorem Ipsum dummy text provided by https://lipsum.com, plus a \
growing list of other dummy texts in different languages."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.7svn77682"

RPM_NAME = "texlive-lipsum-2026.226.2.7svn77682-61.2.noarch.rpm"
RPM_HASH = "4f73dd664d912baad31847b1c4859a57d2c81a97b0cef7c558bf66bcf9e494230fb0ec7ae92858dc82263fa6e6f7ade4c1eda185f7a8b61e9c126f2100e0cc3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cicero.ltd.tex \
tex-lipsum-cs.ltd.tex \
tex-lipsum.ltd.tex \
tex-lipsum.sty \
texlive-lipsum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
