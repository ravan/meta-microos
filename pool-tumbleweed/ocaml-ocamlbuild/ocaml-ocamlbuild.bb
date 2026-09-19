SUMMARY = "Generic build tool for building OCaml library and programs"
DESCRIPTION = "OCamlbuild is a generic build tool, that has built-in rules for \
building OCaml library and programs. \
 \
OCamlbuild was distributed as part of the OCaml distribution for \
OCaml versions between 3.10.0 and 4.02.3. Starting from OCaml \
4.03, it is now released separately."
LICENSE = "LGPL-2.0-only-with-OCaml-LGPL-linking-exception"

PV = "0.16.1"

RPM_NAME = "ocaml-ocamlbuild-0.16.1-2.2.aarch64.rpm"
RPM_HASH = "b5142f7ea5667616e013932976dac09b5ebdec56d33e5605374af4d218697adffd0d86413e5d3425f8b479e0eb35a810259dd1676e76845afb3de5c38c007f52"

RPROVIDES:${PN} += "ocaml-ocamlbuild"

RDEPENDS:${PN} += "/usr/bin/ocamlrun-a100 \
libc.so.6 \
libm.so.6 \
ocaml-ocamlbuild-devel"

inherit rpm
