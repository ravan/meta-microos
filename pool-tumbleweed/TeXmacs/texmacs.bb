SUMMARY = "A Structured WYSIWYG Scientific Text Editor"
DESCRIPTION = "GNU TeXmacs is a free wysiwyw (what you see is what you want) editing \
platform with special features for scientists. The software aims to provide \
a unified and user friendly framework for editing structured documents with \
different types of content (text, graphics, mathematics, interactive content, \
etc.). The rendering engine uses high-quality typesetting algorithms so as to \
produce professionally looking documents, which can either be printed out \
or presented from a laptop. \
 \
The software includes a text editor with support for mathematical formulas, \
a small technical picture editor and a tool for making presentations from \
a laptop. Moreover, TeXmacs can be used as an interface for many external \
systems for computer algebra, numerical analysis, statistics, etc. \
New presentation styles can be written by the user and new features can be \
added to the editor using the Scheme extension language. A native spreadsheet \
and tools for collaborative authoring are planned for later. \
 \
TeXmacs runs on all major Unix platforms and Windows. Documents can be \
saved in TeXmacs, Xml or Scheme format and printed as Postscript or \
Pdf files. Converters exist for TeX/LaTeX and Html/Mathml."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.5"

RPM_NAME = "TeXmacs-2.1.5-2.1.aarch64.rpm"
RPM_HASH = "0af94a722e1af502b3ce1442acad55529bc04bd8cd2d01fdcfe32e694b939b8f5a8f6054921d4910d35446a121b221cf61346c3d9fb4641c8d31bea777cc179a"

RPROVIDES:${PN} += "TeXmacs"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libaspell.so.15 \
libc.so.6 \
libcrypt.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgnutls.so.30 \
libltdl.so.7 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
