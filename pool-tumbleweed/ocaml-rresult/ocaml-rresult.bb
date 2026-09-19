SUMMARY = "Result value combinators for OCaml"
DESCRIPTION = "Rresult is an OCaml module for handling computation results and errors in an \
explicit and declarative manner, without resorting to exceptions. It defines \
combinators to operate on the result type available from OCaml 4.03 in the \
standard library."
LICENSE = "ISC"

PV = "0.7.0"

RPM_NAME = "ocaml-rresult-0.7.0-2.3.aarch64.rpm"
RPM_HASH = "aaf442aa06ca445fa8d201f7d15d9d78b5341d04d6839523cd98643dbd665a9efcef3692bf70731c969d8ed736842f4b20c3070be6b2ea03f1c31303cd897d2f"

RPROVIDES:${PN} += "ocaml-rresult"

RDEPENDS:${PN} += ""

inherit rpm
