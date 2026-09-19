SUMMARY = "Parser Generator with Java Extension"
DESCRIPTION = "BYACC/J is an extension of the Berkeley v 1.8 YACC-compatible parser \
generator. Standard YACC takes a YACC source file, and generates one or \
more C files from it, which if compiled properly, will produce a \
LALR-grammar parser. This is useful for expression parsing, interactive \
command parsing, and file reading. Many megabytes of YACC code have \
been written over the years. This is the standard YACC tool that is in \
use every day to produce C/C++ parsers. I have added a '-J' flag which \
will cause BYACC to generate Java source code, instead. So there \
finally is a YACC for Java now!"
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "1.15"

RPM_NAME = "byaccj-1.15-5.3.aarch64.rpm"
RPM_HASH = "9e9968c2a94b0cba8c668dde8acef5767dfb01bfb14c07263dc1482c7e52f0b6db4d56004ea6aad006ad1d178a81856c95ee3eb693163d21358ce614615452a5"

RPROVIDES:${PN} += "byaccj"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
man-pages"

inherit rpm
