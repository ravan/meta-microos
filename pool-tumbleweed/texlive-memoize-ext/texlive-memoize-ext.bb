SUMMARY = "Extended support for memoization with Memoize"
DESCRIPTION = "Automatic handling of additional kinds of material by or during \
memoization with Memoize. Provides support for memoizing \
content in tagged PDFs and compatibility with ltx-talk. TikZ \
pictures tagged with alt, actualtext or artifact are handled \
automatically. The package supports automatic detection of \
expl3 syntax zones, auto-replication of expl3 functions without \
'weird' arguments and auto-memoization of l3draw pictures. The \
code is arranged into interdependent modules so activation may \
be customised at load time."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn78219"

RPM_NAME = "texlive-memoize-ext-2026.226.0.0.2svn78219-59.2.noarch.rpm"
RPM_HASH = "3982f3fc493e54e798ba0e0abaf9a2b62db5b461cf89b2c410d4387c11fb07bb302c6c13cdf73824808d4002fb1c231ebf0bba8add8b6b79bb0135cf142c08d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-memoize-ext-debug.sty \
tex-memoize-ext-expl3-common-debug.sty \
tex-memoize-ext-expl3-common.sty \
tex-memoize-ext-expl3-debug.sty \
tex-memoize-ext-expl3.sty \
tex-memoize-ext-l3draw-debug.sty \
tex-memoize-ext-l3draw.sty \
tex-memoize-ext-tag-debug.sty \
tex-memoize-ext-tag.sty \
tex-memoize-ext-talk-debug.sty \
tex-memoize-ext-talk.sty \
tex-memoize-ext.sty \
texlive-memoize-ext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-memoize.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
