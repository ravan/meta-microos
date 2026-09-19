SUMMARY = "Citing features for Italian jurists"
DESCRIPTION = "This style is primarily aimed at Italian legal jurists and \
provides them with the ability to cite legal materials, such as \
legislative acts, regulations, soft law, treaties and case law. \
Additionally, the style codifies the most prevalent citation \
practices amongst Italian legal scholars. Specifically, with \
regard to the citation of legal materials, this style, instead \
of developing the entry types @jurisdiction, @legal, and \
@legislation, creates a new one: @itprov, which can describe a \
wide range of legal sources. Furthermore, it creates a second \
new entry type: @notetoprov, which is used specifically to cite \
so-called 'note a sentenza' (notes to judgement), which closely \
mirrors @itprov, but is literature and, therefore, is intended \
to have the same treatment as standard entry types. The \
citation commands are the standard ones. The @itprov entry type \
comprises the list institution to indicate which authority \
adopted the cited act; the kindprov, nprov, provtitle (or \
titleparties) fields to indicate the minimal 'ID' of the act \
and many others. Finally, the entry type allows to specify \
where the cited act was consulted, whether from an official \
bulletin (the ofbull field), an official portal or a private \
database (the ofportal field), or a journal or collection."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn72942"

RPM_NAME = "texlive-biblatex-accursius-2026.226.1.0svn72942-61.2.noarch.rpm"
RPM_HASH = "ba8e135bc929e3ac3cdd960bf2711e9038c1a558221fbd0456bf6994253916e1ebd77a6611c6cd16be155e35037e25dd5b0ceb7a48356ef4cceac3e69200d442"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-accursius.bbx \
tex-accursius.cbx \
tex-english-accursius.lbx \
tex-french-accursius.lbx \
tex-italian-accursius.lbx \
texlive-biblatex-accursius"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ext-verbose-trad1.bbx \
tex-verbose-trad1.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
