SUMMARY = "Deriving plugin registry"
DESCRIPTION = "Ppx_derivers is a tiny package whose sole purpose is to allow \
ppx_deriving and ppx_type_conv to inter-operate gracefully when \
linked as part of the same ocaml-migrate-parsetree driver."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "ocaml-ppx_derivers-1.2.1-5.1.aarch64.rpm"
RPM_HASH = "0ac68cf8452fa55f2482863108fb89d003dc4da1a82ccc415381b456ee2b3de9aacccc3de71089ae89257ac7512ef236fc6bd8954170fa0bef058785492d136b"

RPROVIDES:${PN} += "ocaml-ppx-derivers"

RDEPENDS:${PN} += ""

inherit rpm
