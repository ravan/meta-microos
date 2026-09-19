SUMMARY = "The Colm programming language environment"
DESCRIPTION = "Colm is a programming language designed for the analysis and \
transformation of computer languages. It has a type system based on \
formal languages. Rather than define classes or data structures, one \
defines grammars. A parser is constructed automatically from the \
grammar, and the parser is used for two purposes: to parse the input \
language, and to parse the structural patterns in the program that \
performs the analysis."
LICENSE = "MIT"

PV = "0.14.7"

RPM_NAME = "colm-devel-0.14.7-2.16.aarch64.rpm"
RPM_HASH = "ef94513b8017758ab6a6f13257cfed1a5cb220db6ed2c07a745ffe02f6a127095bcf173b6f5f5ec128d223269abea58bf9d7770ab7e6a2106f74b706168e63d7"

RPROVIDES:${PN} += "colm-devel \
ragel-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
gcc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcolm-0-14-7 \
libcolm-0.14.7.so \
libfsm-0-14-7 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
