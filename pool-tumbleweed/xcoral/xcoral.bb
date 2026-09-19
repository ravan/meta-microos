SUMMARY = "X11 Editor with C/C++/Java Browser"
DESCRIPTION = "Xcoral provides support for working with C, C++, Java, Perl, Ada, and \
Fortran programs and for the creation of LaTeX and HTML documents. \
With the help of the built-in 'SMall Ansi C Interpreter' (SMAC), \
xcoral can be configured and extended in almost arbitrary ways. \
Examples can be found in the directory /usr/lib/xcoral. It has \
a built-in C/C++/Java browser \
 \
Further information about Xcoral and SMAC is available in the detailed \
online help system (also available Postscript format)."
LICENSE = "GPL-2.0-or-later"

PV = "4.03.1"

RPM_NAME = "xcoral-4.03.1-1.3.aarch64.rpm"
RPM_HASH = "4157d8db2bc472e9f1841fdb91c3432255ee7fa4e70d226efddf2371c90ad40c7b4f952ea7d9c6f563bdfffb84695f6274c93bb91d171bc50578ab952a4c15b4"

RPROVIDES:${PN} += "config-xcoral \
xcoral"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libc.so.6"

inherit rpm
