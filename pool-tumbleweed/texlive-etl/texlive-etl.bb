SUMMARY = "Expandable token list operations"
DESCRIPTION = "This package provides expandable token list operations for \
which expl3's l3tl only has unexpandable variants. These \
expandable versions are typically slower than the unexpandable \
code. Unlike the l3tl versions, the functions in this module \
may contain braces and macro parameter tokens in their \
arguments, but as a drawback they cannot distinguish some \
tokens and do not consider the character code of group-begin \
and group-end tokens. Additionally a general map to token lists \
is provided, modelled after the expl3 internal __tl_act:NNNn \
but with additional features. The package has no immediate use \
for document authors; it only contains expl3 functions intended \
for programmers."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn76924"

RPM_NAME = "texlive-etl-2026.226.0.0.3svn76924-59.2.noarch.rpm"
RPM_HASH = "04f5f48b5ccc09ca15ff7bf3ae03489fc91616337c6dd01a54065ba31b3b3e047585f8aa4c0c649e8d1bb99cc329edddf4eed6eee616378b2683a718b3931cac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-etl.sty \
texlive-etl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
