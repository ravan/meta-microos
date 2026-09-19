SUMMARY = "E-pTeX driver for PGF inter-picture connections"
DESCRIPTION = "The distributed drivers do not support the PGF feature of \
'inter-picture connections' under e-pTeX and dvipdfmx. The \
package uses existing features of dvipdfmx to fix this problem"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-pxpgfmark-2026.226.0.0.2svn77682-60.4.noarch.rpm"
RPM_HASH = "3a3631acc4e76495d116be16d33143b639e52bdc1bee6ffce9c39ec41a4872ce56a7bbb845e055cf64167eb292272d7b870ca3484d2cfbc78437f9104a93b448"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pxpgfmark.sty \
texlive-pxpgfmark"

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
