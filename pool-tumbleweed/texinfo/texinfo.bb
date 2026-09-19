SUMMARY = "Tools for creating documentation from texinfo sources"
DESCRIPTION = "Texinfo is a documentation system that uses a single source file to \
produce both online information and printed output.  Using Texinfo, you \
can create a printed document with the normal features of a book, \
including chapters, sections, cross-references, and indices.  From the \
same Texinfo source file, you can create a menu-driven, online info \
file with nodes, menus, cross-references, and indices using the included \
makeinfo tool."
LICENSE = "GPL-3.0-or-later"

PV = "7.3"

RPM_NAME = "texinfo-7.3-1.5.aarch64.rpm"
RPM_HASH = "6a8597d92d4c14d6a9b0f3993028976f1e6f492dff77b3b315ee8489448188fe0e93363f0a5d680e0b429623953f224ab6a580124410d30b5370446213738e2d"

RPROVIDES:${PN} += "texinfo"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/cat \
/usr/bin/cmp \
/usr/bin/diff \
/usr/bin/grep \
/usr/bin/perl \
/usr/bin/sed \
/usr/bin/sh \
/usr/bin/tar \
/usr/bin/uniq \
makeinfo \
perl \
texlive-biber \
texlive-bibtex \
texlive-dvipdfmx \
texlive-dvips \
texlive-latex \
texlive-makeindex \
texlive-pdftex \
texlive-tex \
texlive-texinfo"

inherit rpm
