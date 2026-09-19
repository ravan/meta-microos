SUMMARY = "Format pretty-printer combinators"
DESCRIPTION = "Fmt exposes combinators to devise Format pretty-printing functions. \
 \
Fmt depends only on the OCaml standard library. The optional Fmt_tty library that allows to setup formatters for terminal color output depends on the Unix library. The optional Fmt_cli library that provides command line support for Fmt depends on Cmdliner."
LICENSE = "ISC"

PV = "0.11.0"

RPM_NAME = "ocaml-fmt-0.11.0-2.3.aarch64.rpm"
RPM_HASH = "4ef9f702f10f53acad4cf90d07ace2a3f0a9d9240ff38e80004297c48044c9cfb8dae96f70e334a92dd20a8b0e51e74fde925bbc2bcccc012966b35112de0b5c"

RPROVIDES:${PN} += "ocaml-fmt"

RDEPENDS:${PN} += ""

inherit rpm
