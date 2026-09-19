SUMMARY = "Adds forward-referencing functionality to the cleveref package"
DESCRIPTION = "Imagine you are reading a long mathematical text such as a text \
book or a thesis. There are plenty of supplementary lemmas, \
propositions, theorems and/or exercises throughout the whole \
text. You ask yourself 'Gosh, while Lemma 1.12 is certainly an \
interesting result, where is this result used later on in this \
long text? I really would find that helpful to decide why I \
should read the proof.' You can, of course, use the PDF search \
function of your viewer to look up the string 'Lemma 1.12', but \
wouldn't it be more helpful if Lemma 1.12 already indicated all \
or at least its most useful/crucial applications via an info \
message? This is what this package tries to address: The info \
message 'Used on p. 40, 43-45 and 101.' would then be printed \
to the header of Lemma 1.12. This is done by extending the \
\\cref and \\Cref commands and giving them an optional argument \
UsedOn. Every time you wish to record a reference in the 'used \
on page list', you would simply type \
\\cref[UsedOn]{<LabelName>}. If you use \\cref without this \
optional argument, this reference won't be recorded in this \
page list."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.0svn70491"

RPM_NAME = "texlive-cleveref-usedon-2026.226.0.0.4.0svn70491-60.2.noarch.rpm"
RPM_HASH = "547cd39f7f4e9213fec6ec1b03e5effe51a94b017beb633c51ad8ee9eabc2c38de7678d824cbf5cee1a3751c4fdcf542da116267aea91d7b7c53851ed34f2287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cleveref-usedon.sty \
texlive-cleveref-usedon"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cleveref.sty \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
