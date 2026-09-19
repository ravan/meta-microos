SUMMARY = "The C preprocessor written in OCaml"
DESCRIPTION = "Cppo is an equivalent of the C preprocessor targeted at the OCaml language and \
its variants. \
 \
The main purpose of cppo is to provide a lightweight tool for simple macro \
substitution (#define) and file inclusion (#include) for the occasional case \
when this is useful in OCaml. Processing specific sections of files by calling \
external programs is also possible via #ext directives. \
 \
The implementation of cppo relies on the standard library of OCaml and on the \
standard parsing tools Ocamllex and Ocamlyacc, which contribute to the \
robustness of cppo across OCaml versions."
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "ocaml-cppo-1.8.0-2.2.aarch64.rpm"
RPM_HASH = "b8f582255aad0489847ba6cb42e86c63460cfa6aba75a52f92ba7ec2d2ea0955cafce2c83a22e122e29ef11b77f5c94b5bbc89d6d4f0968deea1f73ffda29dac"

RPROVIDES:${PN} += "ocaml-cppo"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
