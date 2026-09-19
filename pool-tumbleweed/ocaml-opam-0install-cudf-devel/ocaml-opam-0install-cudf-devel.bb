SUMMARY = "Development files for ocaml-opam-0install-cudf"
DESCRIPTION = "The ocaml-opam-0install-cudf-devel package contains libraries and signature files for \
developing applications that use ocaml-opam-0install-cudf."
LICENSE = "ISC"

PV = "0.5.0"

RPM_NAME = "ocaml-opam-0install-cudf-devel-0.5.0-4.1.aarch64.rpm"
RPM_HASH = "03e14d19c3b8a7b79f07865fdcf48f8e89d4a90527b11a748286a98ea71a31efeec8e22d362c1d38bad9e8704aa882b0762d61275affede6213c71917fcd2169"

RPROVIDES:${PN} += "ocaml-Opam-0install-cudf \
ocaml-Opam-0install-cudf-- \
ocaml-Opam-0install-cudf--Model \
ocaml-Opam-0install-cudf--S \
ocaml-opam-0install-cudf-devel \
ocamlfind-opam-0install-cudf \
ocamlx-Opam-0install-cudf \
ocamlx-Opam-0install-cudf-- \
ocamlx-Opam-0install-cudf--Model \
ocamlx-Opam-0install-cudf--S"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Cudf \
ocaml-Cudf-types \
ocaml-Option \
ocaml-Stdlib \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Fun \
ocaml-Stdlib--Int \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-Zeroinstall-solver \
ocaml-Zeroinstall-solver-- \
ocaml-Zeroinstall-solver--S \
ocaml-opam-0install-cudf \
ocamlfind-0install-solver \
ocamlfind-cudf \
ocamlx-Cudf \
ocamlx-Option \
ocamlx-Stdlib \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Fun \
ocamlx-Stdlib--Int \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--String \
ocamlx-Zeroinstall-solver"

inherit rpm
