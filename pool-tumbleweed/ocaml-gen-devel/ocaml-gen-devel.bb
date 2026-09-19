SUMMARY = "Development files for ocaml-gen"
DESCRIPTION = "The ocaml-gen-devel package contains libraries and signature files for \
developing applications that use ocaml-gen."
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "ocaml-gen-devel-1.1-3.1.aarch64.rpm"
RPM_HASH = "ce963afc68c8f499469befdced85e1a65a5fc1120d7f61cabe064286593552209cf424c1fdc2c0edb2927b8bc83a5d1d40c96f7283fc77f2f1ffddfa0c20c986"

RPROVIDES:${PN} += "ocaml-Gen \
ocaml-Gen-intf \
ocaml-GenClone \
ocaml-GenLabels \
ocaml-GenLabels-intf \
ocaml-GenM \
ocaml-GenM-intf \
ocaml-GenMList \
ocaml-GenShims- \
ocaml-gen-devel \
ocamlfind-gen \
ocamlx-Gen \
ocamlx-Gen-intf \
ocamlx-GenClone \
ocamlx-GenLabels \
ocamlx-GenLabels-intf \
ocamlx-GenM \
ocamlx-GenM-intf \
ocamlx-GenMList \
ocamlx-GenShims-"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalOO \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--List \
ocaml-Stdlib--Nativeint \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Queue \
ocaml-Stdlib--Random \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-gen \
ocamlfind-seq \
ocamlx-CamlinternalOO \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Queue \
ocamlx-Stdlib--Random"

inherit rpm
