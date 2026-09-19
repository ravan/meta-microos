SUMMARY = "A list-driven CV class, allowing TikZ decorations"
DESCRIPTION = "The class provides a set of functionality for writing \
'curriculum vitae' with different layouts. The idea is that a \
user can write some custom configuration directives, by means \
of which is possible both to produce different c.v. layouts and \
quickly switch among them. In order to process such directives, \
the class uses a set of lists, provided by the package \
etextools. Basic support for using TikZ decorations is also \
provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.6svn26807"

RPM_NAME = "texlive-mycv-2026.226.1.5.6svn26807-61.2.noarch.rpm"
RPM_HASH = "735a7ae65f1b1cc2b8eae345e1a980e84fc4bb093b7d0630ddd33f936724e5dd1294af2bc214558326bcf81b7e51cde34462f8ca9e811a348cc697d7f72c3e9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mycv-base.def \
tex-mycv-dec.sty \
tex-mycv-misc.def \
tex-mycv-style.sty \
tex-mycv-version.def \
tex-mycv.cls \
texlive-mycv"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-File--Path \
perl-Getopt--Long \
perl-strict \
perl-warnings \
sed \
tex-amssymb.sty \
tex-article.cls \
tex-babel.sty \
tex-calligra.sty \
tex-etextools.sty \
tex-fancyhdr.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-marvosym.sty \
tex-pifont.sty \
tex-svn-prov.sty \
tex-tikz.sty \
tex-times.sty \
tex-titlesec.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
