SUMMARY = "A tokenizer"
DESCRIPTION = "A tokenizer for LaTeX. \\GetTokens{Target1}{Target2}{Source} \
splits source into two tokens at the first encounter of a \
comma. The first token is saved in a newly created command with \
the name passed as <Target1> and the second token likewise. A \
package option 'trim' causes leading and trailing space to be \
removed from each token; with this option, the \\TrimSpaces \
command is defined, which removes leading and trailing spaces \
from its argument."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn15878"

RPM_NAME = "texlive-tokenizer-2026.226.1.1.0svn15878-59.2.noarch.rpm"
RPM_HASH = "392bee96ec330ee4842e1c6afc48ac9e2325c33e3ae195f7c93b993dd878621306bc7a3583b8e8b6a26599b89763151435161368575570be32a635f8fefe172f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tokenizer.sty \
texlive-tokenizer"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
