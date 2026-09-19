SUMMARY = "List ASCII idiomatic names and octal/decimal code-point form"
DESCRIPTION = "Provides easy conversion between various byte representations and the American \
Standard Code for Information Interchange (ASCII) character table. It knows \
about a wide variety of hex, binary, octal, Teletype mnemonic, ISO/ECMA code \
point, slang names, XML entity names, and other representations. Given any one \
on the command line, it will try to display all others. Called with no \
arguments it displays a handy small ASCII chart."
LICENSE = "BSD-2-Clause"

PV = "3.32"

RPM_NAME = "ascii-3.32-1.3.aarch64.rpm"
RPM_HASH = "7d08db34d62ebedd05554ba189089841f9aa88ecf5b98657a58a05411faa8e96d1a7d67103db72e04cca7febb967dc1729c9269b87d9a47f50cdbbdea597b714"

RPROVIDES:${PN} += "ascii"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
