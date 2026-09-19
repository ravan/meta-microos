SUMMARY = "Macros for typesetting Quantum Information Theory"
DESCRIPTION = "This package provides macros to typeset some general \
mathematical operators (identity operator, trace, diagonal, \
rank, ...), a powerful implementation of the bra-ket notation \
(kets, bras, brakets, matrix elements etc. which can be sized \
as required), delimited expressions such as averages and norms, \
and some basic Lie algebra/group names. Macros for entropy \
measures for quantum information theory (smooth min- and \
max-entropy, smooth relative entropies, etc.) are also \
provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.1svn60734"

RPM_NAME = "texlive-phfqit-2026.226.4.1svn60734-58.2.noarch.rpm"
RPM_HASH = "11f7095ffbe90add672e84ca2bc0effb555f1fc7d5af9c5a7c2b64db7d635747177c24987d8aaa0715e6ac121f2be098c79d8e533617d5db46ce0f427cb5ccd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phfqit.sty \
texlive-phfqit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-calc.sty \
tex-dsfont.sty \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
