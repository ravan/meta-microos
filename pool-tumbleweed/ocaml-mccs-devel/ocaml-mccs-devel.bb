SUMMARY = "Development files for ocaml-mccs"
DESCRIPTION = "The ocaml-mccs-devel package contains libraries and signature files for \
developing applications that use ocaml-mccs."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception & BSD-3-Clause & GPL-3.0-only"

PV = "1.1+19"

RPM_NAME = "ocaml-mccs-devel-1.1+19-4.2.aarch64.rpm"
RPM_HASH = "a11e56db657bddf4692a9042f62b5e45ed138299b0c72532a6ae9687c7be2a99292c06036485f0f1f14c2f495032e951e6aa5530e509b4540db5c9c7272bebbe"

RPROVIDES:${PN} += "config-ocaml-mccs-devel \
ocaml-Mccs \
ocaml-Ocaml-mccs-glpk \
ocaml-mccs-devel \
ocamlfind-mccs \
ocamlfind-mccs.glpk \
ocamlfind-mccs.glpk.internal \
ocamlx-Mccs \
ocamlx-Ocaml-mccs-glpk"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
ocaml-CamlinternalFormatBasics \
ocaml-Cudf \
ocaml-Cudf-types \
ocaml-Stdlib \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Callback \
ocaml-Stdlib--Either \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-mccs \
ocamlfind-cudf \
ocamlfind-mccs.glpk.internal \
ocamlx-Cudf \
ocamlx-Stdlib \
ocamlx-Stdlib--Callback \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Sys"

inherit rpm
