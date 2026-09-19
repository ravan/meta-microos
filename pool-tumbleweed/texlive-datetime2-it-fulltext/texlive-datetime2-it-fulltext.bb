SUMMARY = "Italian full text styles for the datetime2 package"
DESCRIPTION = "Italian date and time styles that use words for the numbers and \
ordinals. This package provides the following date and time \
styles: 'it-fulltext' and 'it-fulltext-twenty-four'. The first \
style uses a format 'am pm', the second a format '24 hours'. \
The necessary packages are datetime2, itnumpar, ifxetex, and \
ifluatex. This package is the translation and adaptation of \
datetime2-en-fulltext."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn54779"

RPM_NAME = "texlive-datetime2-it-fulltext-2026.226.1.6svn54779-59.2.noarch.rpm"
RPM_HASH = "221bf1abc8d36aefc6c4e41d73c2437d832173233f4569e277b6a10c9f1a9e04ebc42a00b7f8aa6c8303f8cc1e6a15f828e5f6a9eff83d55588a3615eb771334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-it-fulltext-ascii.ldf \
tex-datetime2-it-fulltext-utf8.ldf \
tex-datetime2-it-fulltext.sty \
texlive-datetime2-it-fulltext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-datetime2.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-itnumpar.sty \
texlive \
texlive-filesystem \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
