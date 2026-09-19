SUMMARY = "Stamp letters with >>Deutsche Post<<'s service >>Internetmarke<<"
DESCRIPTION = "The postage package is used for franking letters with \
>>Deutsche Post<<'s online postage service >>Internetmarke<<. \
Note that in order to print valid stamps you must point to a \
valid PDF of >>Deutsche Post<<'s >>Ausdruck 4-spaltig (DIN \
A4)<<."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn55920"

RPM_NAME = "texlive-postage-2026.226.1.0svn55920-59.2.noarch.rpm"
RPM_HASH = "c512c819548467faee0e5514758c28fdbe2074273cee749513cc39d2c63217a859f9d21c3a23bf61e37754d2a9b9a36470d37c26927ef53b93b9d23a584f0d13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-postage.sty \
texlive-postage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphicx.sty \
tex-keyval.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
