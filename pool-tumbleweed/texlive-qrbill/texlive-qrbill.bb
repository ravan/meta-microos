SUMMARY = "Create QR bills using LaTeX"
DESCRIPTION = "This LaTeX package provides support for creating QR-bills for \
the new Swiss payment standards. This open source \
implementation is intended to offer a free option to support \
these regulations and can be adapted for international use. \
Packages loaded by qrbill are expl3, fontspec (except if one is \
using a custom font setup), graphicx, scrbase, qrcode, iftex, \
l3keys2e, and numprint."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.01svn76924"

RPM_NAME = "texlive-qrbill-2026.226.2.01svn76924-60.4.noarch.rpm"
RPM_HASH = "34e19bda123d193307abb618b7b943350663b06fccb92dd06d66847aa567748a530d3f7e0d0b3904f3172cbe9c65b6883fb8898d58fd0a88fc36f4213b94258f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epc.qrbill-cfg.tex \
tex-qrbill.sty \
tex-swiss.qrbill-cfg.tex \
texlive-qrbill"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-anyfontsize.sty \
tex-expl3.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-iftex.sty \
tex-l3keys2e.sty \
tex-marvosym.sty \
tex-numprint.sty \
tex-qrcode.sty \
tex-scrbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
