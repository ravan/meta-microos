SUMMARY = "Compiler libraries repackaged"
DESCRIPTION = "This package simply repackage the OCaml compiler libraries so they \
don't expose everything at toplevel. For instance Ast_helper is now \
Ocaml_common.Ast_helper."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "ocaml-ocaml-compiler-libs-0.17.0-1.1.aarch64.rpm"
RPM_HASH = "7bb695bdec94555ad0f977655bebae6278ce9564cf021cea1234338ba8f77c651191cd23977436c3fc6a6e567490784420c942ad949d3f36f7e83dd38110adb1"

RPROVIDES:${PN} += "ocaml-ocaml-compiler-libs"

RDEPENDS:${PN} += ""

inherit rpm
