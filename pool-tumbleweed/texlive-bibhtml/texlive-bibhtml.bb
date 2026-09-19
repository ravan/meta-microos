SUMMARY = "BibTeX support for HTML files"
DESCRIPTION = "Bibhtml consists of a Perl script and a set of BibTeX style \
files, which together allow you to output a bibliography as a \
collection of HTML files. The references in the text are linked \
directly to the corresponding bibliography entry, and if a URL \
is defined in the entry within the BibTeX database file, then \
the generated bibliography entry is linked to this. The package \
provides three different style files derived from each of the \
standard plain.bst and alpha.bst, as well as two style files \
derived from abbrv.bst and unsrt.bst (i.e., eight in total)."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.0.2svn31607"

RPM_NAME = "texlive-bibhtml-2026.226.2.0.2svn31607-61.2.noarch.rpm"
RPM_HASH = "2fa5faf25f70ab5cb6f9cb9b1629b61e5069a85a49d63af2222576017698500a2ad6cb778aa467a564e51fce90c992b9716dc459e592509b3256e4997e5122f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibhtml"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
