SUMMARY = "Declarative definition of command line interfaces for OCaml"
DESCRIPTION = "Cmdliner is a module for the declarative definition of command line interfaces. \
 \
It provides a simple and compositional mechanism to convert command line \
arguments to OCaml values and pass them to your functions. The module \
automatically handles syntax errors, help messages and UNIX man page \
generation. It supports programs with single or multiple commands and respects \
most of the POSIX and GNU conventions."
LICENSE = "ISC"

PV = "2.1.1"

RPM_NAME = "ocaml-cmdliner-2.1.1-1.1.aarch64.rpm"
RPM_HASH = "ba172291d92e467bcb86f2ba3d9033e3427b4c857be3de05c0e1ff2d07530413186ddebbbab9b45221b09c2dc2074598500c329eeb2464e873a558354467e6a8"

RPROVIDES:${PN} += "ocaml-cmdliner"

RDEPENDS:${PN} += ""

inherit rpm
