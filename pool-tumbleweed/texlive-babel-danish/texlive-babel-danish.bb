SUMMARY = "Babel contributed support for Danish"
DESCRIPTION = "The package provides a language definition, file for use with \
babel, which establishes Danish conventions in a document (or a \
subset of the conventions, if Danish is not the main language \
of the document)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3ssvn77682"

RPM_NAME = "texlive-babel-danish-2026.226.1.3ssvn77682-60.2.noarch.rpm"
RPM_HASH = "26f9ea057feb8753dc8ca5b5c9c588b01b957122b64384abdeb28ae6ca1e8c27d7af3db3c12f1057c48b2c4dc0dd7807e064d45b7671cd626ad0b19981290715"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-danish.ldf \
texlive-babel-danish"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
