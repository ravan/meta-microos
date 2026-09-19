SUMMARY = "Basic Support for Writing Burmese"
DESCRIPTION = "This package provides basic support for writing Burmese. The \
package provides a preprocessor (written in Perl), an Adobe \
Type 1 font, and LaTeX macros."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn25185"

RPM_NAME = "texlive-burmese-2026.226.svn25185-59.2.noarch.rpm"
RPM_HASH = "d99681a7d44c239561e88c7e7c4ffa49345dd45d4968c76c05890504ccd1b6cb7a547b3942134492e0a727c57a8f005d601e4642511184acae41e8d1464f8d3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-birm.sty \
tex-burm.tfm \
tex-burmese.map \
tex-ubirm.fd \
texlive-burmese"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-relsize.sty \
tex-updmap.cfg \
texlive \
texlive-burmese-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
