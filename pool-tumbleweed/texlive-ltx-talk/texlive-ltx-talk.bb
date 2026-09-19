SUMMARY = "A class for typesetting presentations"
DESCRIPTION = "This class is experimental, and changes may occur to \
interfaces. Development is focussed on tagging/functionality as \
the primary driver; as such, support for design aspects is \
likely to be lower priority. It requires LaTeX 2025-11-01 or \
later. The ltx-talk class is focused on producing (on-screen) \
presentations, along with support material such as handouts and \
speaker notes. Content is created in a frame environment, each \
of which can be divided up into a number of slides (actual \
output pages). A simple 'overlay' notation is used to specify \
which material appears on each slide within a frame. The class \
supports a range of environments to enable complex slide \
relationships to be constructed. The appearance of slides is \
controlled by a template system. Many of the elements of slides \
can be adjusted by setting simple key-based values in the \
preamble. More complex changes can be implemented by altering \
specific, targeted definitions without needing to rewrite \
entire blocks of code. This allows a variety of visual \
appearances to be selected for the same content source. The \
ltx-talk class has syntax similar to the popular beamer class, \
although there are some (deliberate) differences. However, \
ltx-talk has been implemented to support creation of tagged \
(accessible) PDF output as a core aim. As such, it is suited to \
creating output for reuse in other formats, e.g. HTML \
conversions, without additional steps."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.6svn77950"

RPM_NAME = "texlive-ltx-talk-2026.226.0.0.4.6svn77950-59.2.noarch.rpm"
RPM_HASH = "19e221db8f6a4cdb0eb7e1a59a9a296d5cfe776a58b6f8ab6acd2b859e85fae7e28d2fb1a9ce9da4b3679684d480e7b4ad01718bb076832537ece483a2cc34f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltx-talk.cls \
texlive-ltx-talk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-lmodern.sty \
tex-lua-unicode-math.sty \
tex-mathtools.sty \
tex-relsize.sty \
tex-sansmathfonts.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
