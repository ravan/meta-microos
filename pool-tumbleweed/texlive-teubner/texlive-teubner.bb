SUMMARY = "Philological typesetting of classical Greek"
DESCRIPTION = "An extension to babel greek option for typesetting classical \
Greek with a philological approach. The package works with the \
author's greek fonts using the 'Lispiakos' font shape derived \
from that of the fonts used in printers' shops in Lispia. The \
package name honours the publisher B.G. Teubner \
Verlaggesellschaft whose Greek text publications are of high \
quality."
LICENSE = "LPPL-1.0"

PV = "2026.227.5.8.3svn68074"

RPM_NAME = "texlive-teubner-2026.227.5.8.3svn68074-62.2.noarch.rpm"
RPM_HASH = "067bae63bcc4242ba847ae12bb882999b43683d070a49be866b5d106594a0439807f1a91f2abc5a1ab9b3f786902411acffcde0d8c458b3d48f777dae681c654"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-teubner.sty \
tex-teubnertx.sty \
texlive-teubner"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-exscale.sty \
tex-graphicx.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-ot1cmr.fd \
tex-textalpha.sty \
tex-trace.sty \
tex-ts1pxr.fd \
tex-ts1txr.fd \
tex-type1ec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
