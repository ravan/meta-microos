SUMMARY = "Define data for the pdfpc presentation viewer"
DESCRIPTION = "This packages allows to define additional meta data within the \
PDF file which can be interpreted by the PDF presenter console \
(pdfpc) program. pdfpc depends on kvoptions, xstring, iftex, \
and hyperxmp."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.7.1svn68610"

RPM_NAME = "texlive-pdfpc-2026.226.0.0.7.1svn68610-58.2.noarch.rpm"
RPM_HASH = "5ced98e04a7ca06f9c26f4b6c25d4dbf02d1fa034e6b66b2e061b82895e3e9e60ffe248babe3a181ccb7936dbb930875663eb876ecb98f910a3a2f2e0742a170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfpc.sty \
texlive-pdfpc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperxmp.sty \
tex-iftex.sty \
tex-kvoptions.sty \
tex-pdftexcmds.sty \
tex-stringenc.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
