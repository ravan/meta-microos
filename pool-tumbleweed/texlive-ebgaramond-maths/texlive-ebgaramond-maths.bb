SUMMARY = "Limited LaTeX support for ebgaramond in maths"
DESCRIPTION = "This package provides some LaTeX support for the use of \
EBGaramond12 in mathematics. It is based on, and requires, \
ebgaramond. The package was created in response to a question \
at TeX-stackexchange. and tested in the form of an answer in \
the same forum."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-ebgaramond-maths-2026.226.1.3svn77682-61.4.noarch.rpm"
RPM_HASH = "5afe685305c07614546eb0bc4df73bf3a7ebb94ab8494a2c6ac808f9d1103ecb61e921af8eb0b24b19359064000083c4411dfb0e42ab5102b49ce91455d7e296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-EBGaramond-BoldItalic--oml-ebgaramond.tfm \
tex-EBGaramond-ExtraBoldItalic--oml-ebgaramond.tfm \
tex-EBGaramond-Italic--oml-ebgaramond.tfm \
tex-EBGaramond-Maths.map \
tex-EBGaramond-MediumItalic--oml-ebgaramond.tfm \
tex-EBGaramond-SemiBoldItalic--oml-ebgaramond.tfm \
tex-OMLEBGaramond-Maths.fd \
tex-ebgaramond-maths.sty \
tex-oml-ebgaramond-1.enc \
texlive-ebgaramond-maths"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ebgaramond.sty \
tex-svn-prov.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
