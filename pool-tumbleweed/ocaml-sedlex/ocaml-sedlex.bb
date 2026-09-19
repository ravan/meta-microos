SUMMARY = "Unicode-friendly lexer generator"
DESCRIPTION = "A lexer generator for OCaml, similar to ocamllex, but supporting Unicode. \
Contrary to ocamllex, lexer specifications for sedlex are embedded in \
regular OCaml source files."
LICENSE = "MIT"

PV = "3.7"

RPM_NAME = "ocaml-sedlex-3.7-1.3.aarch64.rpm"
RPM_HASH = "13c14bccbb3edcb63e73a279267006da09317de52bea5bd57a08f57a834f901489fee4cfcc526a7a78a02fedb5c98b3c218ea1a418a154e5c7380873330e98de"

RPROVIDES:${PN} += "ocaml-sedlex"

RDEPENDS:${PN} += ""

inherit rpm
