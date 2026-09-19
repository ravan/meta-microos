SUMMARY = "Typeset gamebooks and other interactive novels"
DESCRIPTION = "This package provides the means in order to lay-out gamebooks \
with LaTeX. A simple gamebook example is included with the \
package, and acts as a tutorial."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn24714"

RPM_NAME = "texlive-gamebook-2026.226.1.0svn24714-60.2.noarch.rpm"
RPM_HASH = "31c7be2d2e40bc4a9aade5b7056525c0e679b54c0f9db1171bb05e9aa68917131a0a9fc64d88a2b83996fc71f69b37e110954b6862afe8a2d3ecd07e838a104b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gamebook.sty \
texlive-gamebook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-draftwatermark.sty \
tex-enumitem.sty \
tex-extramarks.sty \
tex-fancyhdr.sty \
tex-ifthen.sty \
tex-prelim2e.sty \
tex-scrtime.sty \
tex-titlesec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
