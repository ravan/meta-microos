SUMMARY = "Flexible Captioning and Deferred Box/List Printing"
DESCRIPTION = "The package allows the user to optimise presentation of LaTeX \
tables and figures. Boxhandler will lay out table and figure \
captions with a variety of stylistic appearances, and will also \
allow figures and tables to be 'wrapped' in a manner consistent \
with many business and government documents. For a document \
that might appear in different venues with different \
formatting, boxhandler permits the creation of a LaTeX source \
document that can, with a single-line change in the source \
code, produce an output that has very different layout from the \
baseline configuration, not only in terms of caption style, but \
more importantly in terms of the locations where figures, \
tables and lists appear (or not) in the document. Deferral \
routines also allow one to keep all figure and table data in a \
separate source file, while nonetheless producing a document \
with figures and tables appearing in the desired location."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.30svn76790"

RPM_NAME = "texlive-boxhandler-2026.226.1.30svn76790-59.2.noarch.rpm"
RPM_HASH = "591d67a4349acf3b339b8d5e24c5d65bad2f0bb417b89cad669880682efc193c47c05cbfcc8e11e83926d930946d7b495872a3d9fdd474e798a79005575a9b71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-boxhandler.sty \
texlive-boxhandler"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-pbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
