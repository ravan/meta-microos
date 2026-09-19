SUMMARY = "Italian translation of fancyhdr documentation"
DESCRIPTION = "The translation is of documentation provided with the fancyhdr \
package."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn21912"

RPM_NAME = "texlive-fancyhdr-it-2026.226.svn21912-59.2.noarch.rpm"
RPM_HASH = "6a4e93347fa3a2608bfa39f8c49987ab774484741a11e9f500d5356fd47410c45a4b2b94148147d5710b0637710b61871f3a16bd26d52dfbb421aadd9a33b8cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancyhdr-it"

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
