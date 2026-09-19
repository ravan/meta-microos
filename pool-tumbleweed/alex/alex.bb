SUMMARY = "Alex is a tool for generating lexical analysers in Haskell"
DESCRIPTION = "Alex is a tool for generating lexical analysers in Haskell. It takes a \
description of tokens based on regular expressions and generates a Haskell \
module containing code for scanning text efficiently. It is similar to the tool \
lex or flex for C/C++."
LICENSE = "BSD-3-Clause"

PV = "3.5.4.2"

RPM_NAME = "alex-3.5.4.2-1.3.aarch64.rpm"
RPM_HASH = "f088414c2d3a3e16b2b1a6147ccd1ef861ef750edca4bb12560c3f8ccfd24b0f02cf2f71b576c66ace069fb120341a0f4c3be70e9e4f6eee98a501e5b7670cc8"

RPROVIDES:${PN} += "alex"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
