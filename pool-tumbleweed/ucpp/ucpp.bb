SUMMARY = "A preprocessor compliant to C99"
DESCRIPTION = "ucpp is a preprocessor for C source code, specifically code compliant to the \
ISO standard 9899:1999, also known as C99. A preprocessor is responsible for \
macro replacement, conditional compilation and inclusion of header files. \
 \
ucpp operates in two modes: \
-- lexer mode: ucpp is linked to some other code and outputs a stream of \
tokens (each call to the lex() function will yield one token) \
-- non-lexer mode: ucpp preprocesses text and outputs the resulting text \
to a file descriptor; if linked to some other code, the cpp() function \
must be called repeatedly, otherwise ucpp is a stand-alone binary."
LICENSE = "BSD-3-Clause"

PV = "1.3.5"

RPM_NAME = "ucpp-1.3.5-2.29.aarch64.rpm"
RPM_HASH = "fa90ede3b42cefa98a61cad6f8cea525534ae6d0dce06d5daf332f7b5171bda4c2a5c84d4c3ded2b359a814a554ad18387a7561df6ee8aab74c572375ae8162a"

RPROVIDES:${PN} += "ucpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libucpp.so.13"

inherit rpm
