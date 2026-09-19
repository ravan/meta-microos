SUMMARY = "Use Pygments to format code listings in documents"
DESCRIPTION = "PygmenTeX is a Python-based LaTeX package that can be used for \
typesetting code listings in a LaTeX document using Pygments. \
Pygments is a generic syntax highlighter for general use in all \
kinds of software such as forum systems, wikis or other \
applications that need to prettify source code."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn64131"

RPM_NAME = "texlive-pygmentex-2026.226.0.0.11svn64131-60.4.noarch.rpm"
RPM_HASH = "e21b16bb9f04c9cc9a6455fc584941df8a23bfee71766d472eb950b474e50a33426ea39e8fa109cd5ce4cbc0715f7f733bffd875ef76fe590e70518889226cea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pygmentex.sty \
texlive-pygmentex"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption.sty \
tex-color.sty \
tex-efbox.sty \
tex-fancyvrb.sty \
tex-ifthen.sty \
tex-mdframed.sty \
tex-pgfkeys.sty \
tex-shellesc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pygmentex-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
