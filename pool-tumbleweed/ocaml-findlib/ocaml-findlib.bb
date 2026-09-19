SUMMARY = "Objective CAML package manager and build helper"
DESCRIPTION = "Findlib is a library manager for Objective Caml. It provides a \
convention how to store libraries, and a file format ('META') to \
describe the properties of libraries. There is also a tool (ocamlfind) \
for interpreting the META files, so that it is very easy to use \
libraries in programs and scripts."
LICENSE = "MIT"

PV = "1.9.8"

RPM_NAME = "ocaml-findlib-1.9.8-1.3.aarch64.rpm"
RPM_HASH = "4902d42f1740060788f026a269c48b5682d64e0e95b71cd35bd9620ca459404ab9f85cca2c31dc46e50b8c88e53fa44b4db1bc54973e6245db0f55862741211e"

RPROVIDES:${PN} += "ocaml-findlib \
ocamlfind"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
ocaml-compiler-libs \
ocaml-runtime"

inherit rpm
