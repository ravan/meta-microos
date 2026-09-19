SUMMARY = "Upright calligraphic font based on TX calligraphic"
DESCRIPTION = "This small package provides a means of loading as \\mathcal \
upright versions of the calligraphic fonts from the TX font \
package. A scaled option to provided to allow arbitrary \
scaling."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.00svn77682"

RPM_NAME = "texlive-txuprcal-2026.226.1.00svn77682-59.2.noarch.rpm"
RPM_HASH = "488aaa98cabc9d5b41b41b193182810a3ca10d5bf7a0875483fa12b14ae0613444f8bafd66d3d797dba14c9ad51131960466fdfe9dfd83891a84d74ab491b4d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-TXUprCal.map \
tex-txUprCal-Bold.tfm \
tex-txUprCal-Regular.tfm \
tex-txuprcal.sty \
tex-utxuprcal.fd \
texlive-txuprcal"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-txuprcal-fonts"

inherit rpm
