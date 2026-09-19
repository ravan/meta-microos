SUMMARY = "Epigraphs using key values"
DESCRIPTION = "This package lays out epigraphs: quotations across a page, \
usually to open or close a chapter. It is intended as a simple \
replacement for the more sophisticated epigraph package. The \
package depends on pgfkeys, conditionals (which is distributed \
as part of the songbook package), enumitem, and microtype."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75301"

RPM_NAME = "texlive-epigraph-keys-2026.226.1.0svn75301-61.4.noarch.rpm"
RPM_HASH = "f9f982d99b3137da1f79eebb030b0c26babe5574e386cef991dde3135a7f9d6423121f28ca873db83e7f1a326be75aeb63b8de79f6596d1e49f4a3db7fef1776"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epigraph-keys.sty \
texlive-epigraph-keys"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-conditionals.sty \
tex-enumitem.sty \
tex-microtype.sty \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
