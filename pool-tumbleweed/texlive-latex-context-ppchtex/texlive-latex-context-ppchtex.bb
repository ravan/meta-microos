SUMMARY = "Legacy stub to allow loading pictex as m-pictex"
DESCRIPTION = "m-pictex.sty was a wrapper for a ConTeXt module making picTeX \
more easily usable in classic TeX with no e-TeX extensions. \
m-pictex.sty is here adjusted to be a stub loading pictex.sty. \
This has not been needed in LaTeX or ConTeXt for decades, but \
old documents may be using this name."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn66687"

RPM_NAME = "texlive-latex-context-ppchtex-2026.226.svn66687-63.2.noarch.rpm"
RPM_HASH = "05aeac8520ccaccde6aa91510b7102c9825c53ca4c629c6e511e1d349f86d4cd507c4faa25c0156eb417aa21dc8731ae659484c203c23a1d8015702f34f116f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-m-pictex.sty \
texlive-latex-context-ppchtex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pictex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
