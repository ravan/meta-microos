SUMMARY = "Pure OCaml regular expressions"
DESCRIPTION = "Pure OCaml regular expressions, with support for Perl and POSIX-style strings."
LICENSE = "LGPL-2.1-or-later-with-OCaml-LGPL-linking-exception"

PV = "1.14.0"

RPM_NAME = "ocaml-re-1.14.0-2.1.aarch64.rpm"
RPM_HASH = "4c553ff53394e9bc0d1e4ab3910569bb1888b025940140dca480b4d046a0300512654b4804b54779ab5ecaf4388b535b92c9e78759211a04506b6d349ae4e5e9"

RPROVIDES:${PN} += "ocaml-re"

RDEPENDS:${PN} += ""

inherit rpm
