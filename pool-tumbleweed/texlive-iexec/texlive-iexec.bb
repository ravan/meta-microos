SUMMARY = "Execute shell commands and input their output"
DESCRIPTION = "With the help of the \\iexec command, you can execute a shell \
command and then input its output into your document. This \
package also lets you use any special symbols inside your \
command."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.15.0svn73480"

RPM_NAME = "texlive-iexec-2026.226.0.0.15.0svn73480-60.2.noarch.rpm"
RPM_HASH = "7028e8dede4b2de208196f45524352a56e0292d5b6b3d301c45cf13468d9043cc6e4570d1f86f2e50a7819f6b68a00baeb8e80539eb1c5b36d7bb0da13b5ae63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iexec.sty \
texlive-iexec"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-shellesc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
