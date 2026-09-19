SUMMARY = "Source Code Beautifier for C, C++, C#, ObjectiveC, D"
DESCRIPTION = "Source Code Beautifier for C, C++, C#, ObjectiveC, D, Java, Pawn and VALA. \
 \
Features: \
  * Ident code, aligning on parens, assignments, etc. \
  * Align on '=' and variable definitions. \
  * Align structure initializers. \
  * Align #define stuff. \
  * Align backslash-newline stuff. \
  * Reformat comments (a little bit). \
  * Fix inter-character spacing. \
  * Add or remove parens on return statements. \
  * Add or remove braces on single-statement if/do/while/for statements. \
  * Supports embedded SQL 'EXEC SQL' stuff. \
  * Highly configurable - 454 configurable options as of version 0.60."
LICENSE = "GPL-2.0-or-later"

PV = "0.82.0"

RPM_NAME = "uncrustify-0.82.0-1.4.aarch64.rpm"
RPM_HASH = "0042cc657b95f10984ac865bfaaedbfc4d6371ac50fec360fbb43cd2004036d5189a102b708145e1647181495d242b8bffe3eb87b6982fc578d9caf441c16b5c"

RPROVIDES:${PN} += "uncrustify"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
