SUMMARY = "Make emojis more easy to use in XeLaTeX and LuaLaTeX"
DESCRIPTION = "There are many emojis with long names, and we cannot remember \
them all. At the same time, when we type an emoji, we want to \
see what it looks like in text editor. Now, you do not need to \
remember the emoji name, just select it from the keyboard and \
wrap it with \\emotion. Unlike other emoji packages, you can \
thus use emojis more easily and flexibly."
LICENSE = "Apache-1.0"

PV = "2026.226.0.0.2svn76924"

RPM_NAME = "texlive-emotion-2026.226.0.0.2svn76924-61.4.noarch.rpm"
RPM_HASH = "5918f97fe0a1c106cb3410ea498fc6a64132a213990902376952746c7336f60a0dd6a36a22b59a5f3b9f310e9839f8d8e9d923656554626d4ad89342252dd548"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emotion.def \
tex-emotion.sty \
texlive-emotion"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-fontspec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
