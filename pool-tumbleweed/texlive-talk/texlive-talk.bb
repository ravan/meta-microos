SUMMARY = "A LaTeX class for presentations"
DESCRIPTION = "The talk document class allows you to create slides for screen \
presentations or printing on transparencies. It also allows you \
to print personal notes for your talk. You can create overlays \
and display structure information (current section / \
subsection, table of contents) on your slides. The main feature \
that distinguishes talk from other presentation classes like \
beamer or prosper is that it allows the user to define an \
arbitrary number of slide styles and switch between these \
styles from slide to slide. This way the slide layout can be \
adapted to the slide content. For example, the title or \
contents page of a talk can be given a slightly different \
layout than the other slides. The talk class makes no \
restrictions on the slide design whatsoever. The entire look \
and feel of the presentation can be defined by the user. The \
style definitions should be put in a separate sty file. \
Currently the package comes with two sets of pre-defined slide \
styles (talk-simple.sty and talk-sidebars.sty). Contributions \
from people who are artistically more gifted than the author \
are more than welcome!"
LICENSE = "LPPL-1.0"

PV = "2026.227.2.0svn76392"

RPM_NAME = "texlive-talk-2026.227.2.0svn76392-62.2.noarch.rpm"
RPM_HASH = "5f8a1eab35b92b36107b8955ef88b9c3db20416e0492c929767dead83f492c0a18e41f4323d148ff9cd5875a7f890d92a41d2551dcf763ced7d73eba99d2056e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-talk-sidebars.sty \
tex-talk-simple.sty \
tex-talk.cls \
texlive-talk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-cmbright.sty \
tex-environ.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-multido.sty \
tex-pgf.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
