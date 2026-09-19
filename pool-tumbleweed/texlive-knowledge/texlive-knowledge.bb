SUMMARY = "Displaying, hyperlinking, and indexing notions in a document"
DESCRIPTION = "The package offers a systematic way to handle \
notions/concepts/terms throughout a document. It helps building \
an index. In combination with hyperref it makes it easy to have \
every reference of a concept linked to its introduction. It \
also offers simple notations."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.31svn76924"

RPM_NAME = "texlive-knowledge-2026.226.1.31svn76924-63.2.noarch.rpm"
RPM_HASH = "be4bfc8c35b281021e3ee1d9520af76dc1663bb51a472bd8fd68181fc98313d99e2ae5de14015afc0c3e3b19d77b5f5e2cbc0b69b8f4608a8dba54f7f44e261f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-knowledge.sty \
texlive-knowledge"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-currfile.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
