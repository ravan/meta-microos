SUMMARY = "Ocaml OUnit test framework"
DESCRIPTION = "OUnit is a unit test framework for OCaml. It allows one to easily \
create unit-tests for OCaml code. It is based on HUnit, a unit testing \
framework for Haskell. It is similar to JUnit, and other xUnit testing \
frameworks."
LICENSE = "MIT"

PV = "2.2.7"

RPM_NAME = "ocaml-ounit-2.2.7-3.1.aarch64.rpm"
RPM_HASH = "eab638184a472186d907709a4ddd174691f02770bf2860d3c8698002d317d929a723f4dc1dd060120ba083e08f666498a1873b84c9d7efd0810abb8228bb0963"

RPROVIDES:${PN} += "ocaml-ounit"

RDEPENDS:${PN} += ""

inherit rpm
