SUMMARY = "Harvard citation package for use with LaTeX2e"
DESCRIPTION = "This is a re-implementation, for LaTeX2e, of the original \
Harvard package. The bundle contains the LaTeX package, several \
BibTeX styles, and a 'Perl package' for use with LaTeX2HTML. \
Harvard is an author-year citation style (all but the first \
author are suppressed in second and subsequent citations of the \
same entry); the package defines several variant styles: \
apsr.bst for the American Political Science Review; agsm.bst \
for Australian Government publications; dcu.bst from the Design \
Computing Unit of the University of Sydney; kluwer.bstwhich \
aims at the format preferred in Kluwer publications; \
nederlands.bst which deals with sorting Dutch names with \
prefixes (such as van) according to Dutch rules, together with \
several styles whose authors offer no description of their \
behaviour."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.5svn77682"

RPM_NAME = "texlive-harvard-2026.226.2.0.5svn77682-60.4.noarch.rpm"
RPM_HASH = "12b2b0250a9b1a6015675511f5d33ff33c40d586fbaae22733ea0cf63a1c42e06906468161e7dd54e54e1b75a13131c097df345e49f664b090572f11eb28f9c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-harvard.sty \
texlive-harvard"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
