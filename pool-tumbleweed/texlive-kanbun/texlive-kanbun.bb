SUMMARY = "Typeset kanbun-kundoku with support for kanbun annotation"
DESCRIPTION = "This package allows users to manually input macros for elements \
in a kanbun-kundoku (Han Wen Xun Du ) paragraph. More \
importantly, it accepts plain text input in the 'kanbun \
annotation' form when used with LuaLaTeX, which allows \
typesetting kanbun-kundoku paragraphs efficiently."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-kanbun-2026.226.1.3svn77682-63.2.noarch.rpm"
RPM_HASH = "64ae946e9e42245f8ea94b4453dc06df21a908436b287289246ba48d8bdc2ad98e039aaea7d99d9724039879e24081b0701c57fec55095c435f319987e0b250c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kanbun.sty \
texlive-kanbun"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-ifluatex.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
