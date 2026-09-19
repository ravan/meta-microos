SUMMARY = "BibLaTeX styles inspired by the Oxford Guide to Style"
DESCRIPTION = "This bundle provides four BibLaTeX styles that implement (many \
of) the stipulations and examples provided by the 2014 New \
Hart's Rules and the 2002 Oxford Guide to Style: 'oxnotes' is a \
style similar to the standard 'verbose', intended for use with \
footnotes; 'oxnum' is a style similar to the standard \
'numeric', intended for use with numeric in-text citations; \
'oxalph' is a style similar to the standard 'alphabetic', \
intended for use with alphabetic in-text citations; 'oxyear' is \
a style similar to the standard 'author-year', intended for use \
with parenthetical in-text citations. The bundle provides \
support for a wide variety of content types, including \
manuscripts, audiovisual resources, social media and legal \
references."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.3svn72164"

RPM_NAME = "texlive-biblatex-oxref-2026.226.3.3svn72164-61.2.noarch.rpm"
RPM_HASH = "1c0573e4d71b11b802cc6ed51979a94816197e61440e636cd490d9f2941db8c6a5bb69aed27cea9a34d1769797872b2c1555a685f1536a3c601943519ef6ba13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-american-oxref.lbx \
tex-british-oxref.lbx \
tex-english-oxref.lbx \
tex-oxalph.bbx \
tex-oxalph.cbx \
tex-oxnotes-ibid.bbx \
tex-oxnotes-ibid.cbx \
tex-oxnotes-inote.bbx \
tex-oxnotes-inote.cbx \
tex-oxnotes-note.bbx \
tex-oxnotes-note.cbx \
tex-oxnotes-trad1.bbx \
tex-oxnotes-trad1.cbx \
tex-oxnotes-trad2.bbx \
tex-oxnotes-trad2.cbx \
tex-oxnotes-trad3.bbx \
tex-oxnotes-trad3.cbx \
tex-oxnotes.bbx \
tex-oxnotes.cbx \
tex-oxnum.bbx \
tex-oxnum.cbx \
tex-oxref.bbx \
tex-oxyear.bbx \
tex-oxyear.cbx \
tex-polish-oxref.lbx \
tex-spanish-oxref.lbx \
texlive-biblatex-oxref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphabetic.cbx \
tex-authoryear-comp.cbx \
tex-english.lbx \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-numeric-comp.cbx \
tex-standard.bbx \
tex-verbose-ibid.cbx \
tex-verbose-inote.cbx \
tex-verbose-note.cbx \
tex-verbose-trad1.cbx \
tex-verbose-trad2.cbx \
tex-verbose-trad3.cbx \
tex-verbose.cbx \
tex-xpatch.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
