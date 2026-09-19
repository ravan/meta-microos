SUMMARY = "Preprocessor-Pretty-Printer for Objective Caml"
DESCRIPTION = "Camlp5 is a preprocessor-pretty-printer of OCaml, parsing a source file and printing some result on standard output."
LICENSE = "BSD-3-Clause"

PV = "8.05.02"

RPM_NAME = "ocaml-camlp5-8.05.02-1.3.aarch64.rpm"
RPM_HASH = "c632d5835e7600eba0f45a685e1ea12d9e32eed1611a64f63581c25c207f6982f269c3a09ec6f1910f49c50bb6b7df3621dc5591c91b359ea07708d0d957c226"

RPROVIDES:${PN} += "ocaml-camlp5"

RDEPENDS:${PN} += "/usr/bin/ocamlrun-a100 \
libc.so.6 \
libm.so.6 \
libpcre2-8.so.0 \
libzstd.so.1"

inherit rpm
