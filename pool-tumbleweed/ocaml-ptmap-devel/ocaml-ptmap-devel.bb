SUMMARY = "Development files for ocaml-ptmap"
DESCRIPTION = "The ocaml-ptmap-devel package contains libraries and signature files for \
developing applications that use ocaml-ptmap."
LICENSE = "LGPL-2.1-or-later-with-OCaml-linking-exception"

PV = "2.0.5"

RPM_NAME = "ocaml-ptmap-devel-2.0.5-4.1.aarch64.rpm"
RPM_HASH = "86e0df2d9b20ec2d423de4820ceac92aa498c28407211379128b18b5d20c5914e804b787d7aee7ce367da977fb7b7734f193f1c0d4a891d6351f21dd1e1c90e1"

RPROVIDES:${PN} += "ocaml-Ptmap \
ocaml-ptmap-devel \
ocamlfind-ptmap \
ocamlx-Ptmap"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Either \
ocaml-Stdlib--Seq \
ocaml-ptmap \
ocamlfind-seq \
ocamlx-Stdlib \
ocamlx-Stdlib--Seq"

inherit rpm
