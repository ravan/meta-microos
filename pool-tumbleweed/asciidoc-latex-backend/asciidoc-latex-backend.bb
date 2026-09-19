SUMMARY = "Provide latex backend dependencies"
DESCRIPTION = "AsciiDoc can generate pdf from asciidoc format through dblatex. For that it needs quite some \
latex dependencies that we don't want to have by default. So this package is optional."
LICENSE = "GPL-2.0-or-later"

PV = "10.2.1"

RPM_NAME = "asciidoc-latex-backend-10.2.1-2.1.noarch.rpm"
RPM_HASH = "53131bce7ed7a45521b4acdecf58b39c88156e2c8cf317e4b7c14c659aa8e3d0b279f7849ac03a83a38cab0e29406c4adf686e4a667d02169a82c7402ef74a64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "asciidoc-latex-backend"

RDEPENDS:${PN} += "asciidoc \
dblatex \
tex-8r.enc \
tex-fancybox.sty \
tex-mathrsfs.sty \
tex-pcrr8c.tfm \
tex-phvr8t.tfm \
tex-ptmr8t.tfm \
tex-ptmri7t.tfm \
tex-rsfs10.tfm \
tex-upquote.sty \
tex-zptmcm7v.tfm \
tex-zptmcm7y.tfm \
texlive-metafont-bin"

inherit rpm
