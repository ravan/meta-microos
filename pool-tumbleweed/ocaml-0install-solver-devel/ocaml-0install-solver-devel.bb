SUMMARY = "Development files for ocaml-0install-solver"
DESCRIPTION = "The ocaml-0install-solver-devel package contains libraries and signature files for \
developing applications that use ocaml-0install-solver."
LICENSE = "LGPL-2.1-or-later"

PV = "2.18"

RPM_NAME = "ocaml-0install-solver-devel-2.18-4.1.aarch64.rpm"
RPM_HASH = "d953f345aa6ca8f73e4c5926d503708188b9837c6fdac65c826da8951526147cf829f34f37b774c22617cecba2d45cc3855565e1886b74eab5b6e854f5ccd0fe"

RPROVIDES:${PN} += "ocaml-0install-solver-devel \
ocaml-Zeroinstall-solver \
ocaml-Zeroinstall-solver-- \
ocaml-Zeroinstall-solver--Diagnostics \
ocaml-Zeroinstall-solver--S \
ocaml-Zeroinstall-solver--Sat \
ocaml-Zeroinstall-solver--Solver-core \
ocamlfind-0install-solver \
ocamlx-Zeroinstall-solver \
ocamlx-Zeroinstall-solver-- \
ocamlx-Zeroinstall-solver--Diagnostics \
ocamlx-Zeroinstall-solver--S \
ocamlx-Zeroinstall-solver--Sat \
ocamlx-Zeroinstall-solver--Solver-core"

RDEPENDS:${PN} += "ocaml-0install-solver \
ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-CamlinternalOO \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--List \
ocaml-Stdlib--ListLabels \
ocaml-Stdlib--Map \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Option \
ocaml-Stdlib--Queue \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocamlx-CamlinternalLazy \
ocamlx-CamlinternalOO \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--List \
ocamlx-Stdlib--ListLabels \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Option \
ocamlx-Stdlib--Queue \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--String"

inherit rpm
