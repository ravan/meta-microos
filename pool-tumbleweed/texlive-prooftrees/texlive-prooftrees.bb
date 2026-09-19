SUMMARY = "Forest-based proof trees (symbolic logic)"
DESCRIPTION = "The package supports drawing proof trees of the kind often used \
in introductory logic classes, especially those aimed at \
students without strong mathematical backgrounds. Hodges (1991) \
is one example of a text which uses this system. When teaching \
such a system it is especially useful to annotate the tree with \
line numbers, justifications and explanations of branch \
closures. prooftrees provides a single environment, prooftree, \
and a variety of tools for annotating, customising and \
highlighting such trees. A cross-referencing system is provided \
for trees which cite line numbers in justifications for proof \
lines or branch closures. prooftrees is based on forest and, \
hence, TikZ. The package requires version 2.1+ of forest for \
expected results. It will not work with versions prior to 2.1."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.3svn78038"

RPM_NAME = "texlive-prooftrees-2026.226.0.0.9.3svn78038-59.2.noarch.rpm"
RPM_HASH = "832cdefe6a357adbea5a285b9c78a85085372b7153981d0b6ec445957be35908a940900c49b50c5d8fb909e5317d5a6dbfe4e2e77eba71f0c6e5c72e278607c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-prooftrees-debug.sty \
tex-prooftrees.sty \
texlive-prooftrees"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-forest.sty \
tex-memoize-ext-debug.sty \
tex-memoize-ext.sty \
tex-svn-prov.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
