SUMMARY = "Development files for ocaml-camlp-streams"
DESCRIPTION = "The ocaml-camlp-streams-devel package contains libraries and signature files for \
developing applications that use ocaml-camlp-streams."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception"

PV = "5.0.1"

RPM_NAME = "ocaml-camlp-streams-devel-5.0.1-3.1.aarch64.rpm"
RPM_HASH = "0a34b106b52e1c2d158749756e420888ee55443ad343db4401e22a15b157e4f9577995a486b7bef78aae48ee789a140cff93c4e8841e7588b17d0fae3980d4ff"

RPROVIDES:${PN} += "ocaml-Genlex \
ocaml-Stream \
ocaml-camlp-streams-devel \
ocamlfind-camlp-streams \
ocamlx-Genlex \
ocamlx-Stream"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-Stdlib \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Char \
ocaml-Stdlib--Either \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--List \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-camlp-streams \
ocamlx-CamlinternalLazy \
ocamlx-Stdlib \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--List \
ocamlx-Stdlib--String"

inherit rpm
