SUMMARY = "Framework for exercise problems"
DESCRIPTION = "This LaTeX2e package provides a general purpose framework to \
describe and typeset exercises and exam questions along with \
their solutions. The package features mechanisms to hide or \
postpone solutions, to assign and handle points, to collect \
problems on exercise sheets, to store and use metadata, and to \
implement a consistent numbering. It also provides a very \
flexible interface for configuring and customising the \
formatting, layout, and representation of the exercise content."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.5.2svn77449"

RPM_NAME = "texlive-exframe-2026.226.3.5.2svn77449-59.2.noarch.rpm"
RPM_HASH = "eefcd3ad9658370489f002055cac79d769a0eb1d56b5c083d73b978e1231233209fcc0e2f81db7b1c975c589f1c2b25d4d9b02d26829ab20157a9be8bbe6af71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exframe.sty \
texlive-exframe"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-metastr.sty \
tex-verbatim.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
