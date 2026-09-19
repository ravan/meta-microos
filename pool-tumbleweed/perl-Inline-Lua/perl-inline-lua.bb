SUMMARY = "Perl extension for embedding Lua scripts into Perl code"
DESCRIPTION = "Inline::Lua allows you to write functions in Lua. Those of you who are not \
yet familiar with Lua should have a cursory glance at http://www.lua.org/ \
to get a taste of this language. In short: \
 \
Lua was designed to be embedded into other applications and not so much as \
a language on its own. However, despite its small set of language features, \
it is an extremely powerful and expressive language. Its strong areas are \
an elegant and yet concise syntax, good overall performance and a beautiful \
implementation of some concepts from the world of functional programming."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.170.0"

RPM_NAME = "perl-Inline-Lua-0.170.0-1.8.aarch64.rpm"
RPM_HASH = "2e050e615bcd578a64d0654c768cc59b93a00d19d7ddf89babb881a5b1259fa845d875851a0bc96790e9b5cd8cf1c64b8f946c60a295e27efb5be1541b03368d"

RPROVIDES:${PN} += "perl-Inline--Lua \
perl-Inline-Lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
perl--MODULE-COMPAT-5.44.0 \
perl-Inline \
perl-Test--Exception"

inherit rpm
