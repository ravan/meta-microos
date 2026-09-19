SUMMARY = "Generate Tag Files for Use with Emacs"
DESCRIPTION = "ETags generates tag files from source code in Pascal, Cobol, Ada, Perl, \
LaTeX, Scheme, Emacs Lisp/Common Lisp, Postscript, Erlang, Python, Prolog, \
and most assembler-like syntaxes."
LICENSE = "GPL-3.0-or-later"

PV = "31.1"

RPM_NAME = "etags-31.1-3.1.aarch64.rpm"
RPM_HASH = "24c5edae507ae5de76ebea6f47a06df8612c973b2455c8261ca83b4d429a6c5ea807037ae31fc3341a4e57d6c37b558a4379b81e293b12632d3623dd913625f7"

RPROVIDES:${PN} += "etags"

RDEPENDS:${PN} += "coreutils \
ctags \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
