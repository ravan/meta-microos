SUMMARY = "Borland-style programming environment and editor for console and X11"
DESCRIPTION = "xwpe (the X Windows Programming Environment) is a programming and text editor \
in the style of the Borland Turbo C IDE of the early 1990s -- written by Fred \
Kruse in 1993, maintained by Dennis Payne from 2000 to 2006, and revived in \
2026. A single binary runs in four modes chosen by the program name: wpe and \
we in the console (ncurses), xwpe and xwe under X11 with anti-aliased Xft/Cairo \
rendering, UTF-8 and color emoji. \
 \
It pairs a syntax-highlighting editor with a Borland-style menu and dialog \
system, project management, compiler integration for many languages (C/C++, \
Fortran, Pascal, Java, Python, Perl, COBOL, LaTeX) and source-level debugging \
through gdb, jdb and pdb."
LICENSE = "GPL-2.0-only"

PV = "1.6.6"

RPM_NAME = "xwpe-1.6.6-1.3.aarch64.rpm"
RPM_HASH = "f8e5a4387f786ef60c9c564ba45134c94ad468b02c5604c0b13fbb2f1f4dd6128b8a8b33e76f053ae6c5bc5a151e6ff745645e9ed43751aa4fe5a85fbc53ccbc"

RPROVIDES:${PN} += "xwpe"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgobject-2.0.so.0 \
libgpm.so.2 \
libjson-c.so.5 \
libncursesw.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libtinfo.so.6 \
libvterm.so.0"

inherit rpm
