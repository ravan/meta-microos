SUMMARY = "Backtracking LALR(1) parser generator"
DESCRIPTION = "Kelbt generates backtracking LALR(1) parsers. Where traditional \
LALR(1) parser generators require static resolution of shift/reduce \
conflicts, Kelbt generates parsers that handle conflicts by \
backtracking at runtime. Kelbt is able to generate a parser for any \
context-free grammar that is free of hidden left recursion."
LICENSE = "GPL-2.0-or-later"

PV = "0.16"

RPM_NAME = "kelbt-0.16-2.22.aarch64.rpm"
RPM_HASH = "b84bb4ce5210da7422e6df623899f7ec5249a3be8b25d38238a31e48919a5dfe6d0033158594c144c08091bf6883a036afe31283911473f8cbb42db50e7f10d8"

RPROVIDES:${PN} += "kelbt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
