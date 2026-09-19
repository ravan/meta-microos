SUMMARY = "OCaml ExtLib additions to the standard library"
DESCRIPTION = "ExtLib is a project aiming at providing a complete - yet small - \
standard library for the OCaml programming language. The purpose of \
this library is to add new functions to OCaml Standard Library \
modules, to modify some functions in order to get better performances \
or more safety (tail-recursive) but also to provide new modules which \
should be useful for the average OCaml programmer."
LICENSE = "LGPL-2.1-or-later-with-OCaml-LGPL-linking-exception"

PV = "1.8.0"

RPM_NAME = "ocaml-extlib-1.8.0-2.2.aarch64.rpm"
RPM_HASH = "120a386d01737f9107bfb3877b0c6b74e76492fd02fdf311088da79e6abc47ef6b09557d76e986c871af6e25ffeeb352b5d75c93d488dfdbbf2bdc8bad429391"

RPROVIDES:${PN} += "ocaml-extlib"

RDEPENDS:${PN} += ""

inherit rpm
