SUMMARY = "Parser and printer for the opam file syntax"
DESCRIPTION = "This is a parser and a printer for the opam file syntax."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception"

PV = "2.2.0"

RPM_NAME = "opam-file-format-2.2.0-2.1.aarch64.rpm"
RPM_HASH = "4b29cb9f469eaeaaacb96775983f799a6fe46778afed2d7d273b84d4d5484b1ef1a3999292a42aec4e0554f3483ac4cd2edf984a957c57e3ce2a52c13482f2ce"

RPROVIDES:${PN} += "opam-file-format"

RDEPENDS:${PN} += ""

inherit rpm
