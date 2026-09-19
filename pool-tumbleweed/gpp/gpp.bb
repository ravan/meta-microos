SUMMARY = "Generic Preprocessor"
DESCRIPTION = "GPP is a general-purpose preprocessor with customizable syntax, suitable \
for a wide range of preprocessing tasks. Its independence from any one \
programming language makes it much more versatile than the C preprocessor \
(cpp), while its syntax is lighter and more flexible than that of GNU m4. \
There are built-in macros for use with C/C++, LaTeX, HTML, XHTML, and \
Prolog files."
LICENSE = "LGPL-3.0+"

PV = "2.28"

RPM_NAME = "gpp-2.28-1.11.aarch64.rpm"
RPM_HASH = "8d4d6ddf7d13f2ed91641f840b4e8d4114ae481f8e84e76189d1a731a41cd68a6712c872b6af49029e63edbede20d89e5feebdf43b09b529adce29be6f546d20"

RPROVIDES:${PN} += "gpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
