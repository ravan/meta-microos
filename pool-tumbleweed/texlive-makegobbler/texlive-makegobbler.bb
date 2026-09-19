SUMMARY = "Keep or drop some part of LaTeX source code"
DESCRIPTION = "The makegobbler package provides a mechanism to selectively \
drop (gobble) or keep ('ungobble') portions of LaTeX source \
code, either conditionally or unconditionally. The affected \
code is delimited by user-defined control sequences that act as \
explicit markers. For example, you can define a conditional as \
follows: \\newif\\ifkeep You can then make a portion of the \
source conditional like this: \\keepfalse \
\\MGBkeep*\\ifkeep\\SomeArbitraryDelimitingControlSequence Here, \
everything -- including \\fi#!{}_^$ -- is dropped. \
\\SomeArbitraryDelimitingControlSequence"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.2svn78189"

RPM_NAME = "texlive-makegobbler-2026.226.0.0.3.2svn78189-59.2.noarch.rpm"
RPM_HASH = "b89c809c1e71722ef9b5fa23b3ded616b94facf9cd4d6ae4b7d683cd120b554ff42e203d439eda7ef4af8ecf44745edc0c510c11cbbcdc4d06f083392b985c19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makegobbler.sty \
texlive-makegobbler"

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
