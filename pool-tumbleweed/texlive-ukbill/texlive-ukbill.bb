SUMMARY = "A class for typesetting UK legislation"
DESCRIPTION = "This package provides formatting to easily typeset draft UK \
legislation. The libre font Palatine Parliamentary is required \
to use this package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.1svn69362"

RPM_NAME = "texlive-ukbill-2026.226.1.2.1svn69362-60.2.noarch.rpm"
RPM_HASH = "a8d1fa8f7658bde46f10be985b7795fbf4f2b8da18621aac4dd6f1c172db4b16cf529440974a456824a30ba565a9d4f2f94ff907b63477939cb7f1479ad2b754"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ukbill.cls \
texlive-ukbill"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-ccicons.sty \
tex-changepage.sty \
tex-enumitem.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-hyphenat.sty \
tex-lettrine.sty \
tex-memoir.cls \
tex-paralist.sty \
tex-setspace.sty \
tex-textpos.sty \
tex-titlesec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
