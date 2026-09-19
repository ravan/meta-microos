SUMMARY = "A LaTeX class for writing your homework"
DESCRIPTION = "The current document class is for writing homework. It has the \
following features. Simple and clear interface. Built-in \
support for many theorem-type environments, already configured \
and ready to use. Multilingual support. Page numbers are of the \
form 'Page [current] of [total]', which can help you ensure \
that there are no missing pages when you print your homework \
for submission. Support writing problem statements and \
solutions (or proofs) in different colors. Every statement and \
solution has its own QED symbol, in hollow or solid shape, \
respectively. You can mark the unfinished parts, and a report \
shall be generated at the end of your document for reminding."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78004"

RPM_NAME = "texlive-homework-2026.226.svn78004-60.4.noarch.rpm"
RPM_HASH = "f2a1e7cef2d288bb4982d5e91bf5728fe4fdff5c003a1b360a2f602aa4f222155f7e695213c7dc9f046e0f43af1c06a17b7c630cedd6f3522439fe5b64c7895e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-homework.cls \
texlive-homework"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ProjLib.sty \
tex-lastpage.sty \
tex-verbatim.sty \
texlive \
texlive-einfart \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
