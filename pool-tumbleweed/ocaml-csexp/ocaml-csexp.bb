SUMMARY = "Parsing and printing of S-expressions in Canonical form"
DESCRIPTION = "This library provides minimal support for Canonical S-expressions. Canonical S-expressions are a binary encoding of S-expressions that is super simple and well suited for communication between programs. \
 \
This library only provides a few helpers for simple applications. If you need more advanced support, such as parsing from more fancy input sources, you should consider copying the code of this library given how simple parsing S-expressions in canonical form is. \
 \
To avoid a dependency on a particular S-expression library, the only module of this library is parameterised by the type of S-expressions."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "ocaml-csexp-1.5.2-2.1.aarch64.rpm"
RPM_HASH = "054d8b4b1c3618072493dcde5d94e23e2333e7ba3a574bc6932969c8ec21ae5055dae4a647339f5bfbac344b28b4488a2c3b820cddcddc1e88a681b2adf61cd7"

RPROVIDES:${PN} += "ocaml-csexp"

RDEPENDS:${PN} += ""

inherit rpm
