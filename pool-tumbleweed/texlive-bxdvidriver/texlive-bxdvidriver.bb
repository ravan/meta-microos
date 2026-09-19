SUMMARY = "Enables specifying a driver option effective only in DVI output"
DESCRIPTION = "This single-function package enables authors to specify a \
global driver option (dvips, dvipdfmx, etc) which is applied \
only when the engine outputs a DVI file. It is useful to create \
special document- templates that can be compiled in both \
PDF-mode and DVI-mode."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2asvn43219"

RPM_NAME = "texlive-bxdvidriver-2026.226.0.0.2asvn43219-59.2.noarch.rpm"
RPM_HASH = "08cb53ec84975ac6512ace33d1da83f468b62580cfa86a1574a5eb9c7f9e97c67c19fdeb38e1b0d76e39e70f6f5f1667576574d05ea3520126058608a4e35cdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxdvidriver.sty \
texlive-bxdvidriver"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-ifvtex.sty \
tex-ifxetex.sty \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
