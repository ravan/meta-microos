SUMMARY = "Extra libraries for tabularray for caption and babel compatibility"
DESCRIPTION = "The tabularray package offers a modern and nice way to typeset \
tables, keeping contents and style separated. The tblr-extras \
package implements extra libraries to use the caption package \
alongside tabularray, and translated strings for continuation \
text in tabularray headers: caption library: Use the caption \
package captions with tabularray environments (talltblr and \
longtblr), babel library: Translated 'continued' text for babel \
languages (spanish, french, ngerman)."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.3svn76924"

RPM_NAME = "texlive-tblr-extras-2026.227.1.3svn76924-62.2.noarch.rpm"
RPM_HASH = "339f6a562a3d2ff8e13c395178fc41ddcca889bae5edb5a38c0eb21745e0f47efe5a9b43d66a5810a71de47b4771359b30fa133b942ed925b74a0b531a70b3f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tblr-extras.sty \
texlive-tblr-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-caption.sty \
tex-tabularray.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
