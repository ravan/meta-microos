SUMMARY = "Development files for ocaml-cmdliner"
DESCRIPTION = "The ocaml-cmdliner-devel package contains libraries and signature files for \
developing applications that use ocaml-cmdliner."
LICENSE = "ISC"

PV = "2.1.1"

RPM_NAME = "ocaml-cmdliner-devel-2.1.1-1.1.aarch64.rpm"
RPM_HASH = "b447c82110d9659ac833101cae946148f785b729d117b9bef7b72c68b14f711bbad4f13f4624e50fd08b875eeafdaa82a8ef9eafbf6a13a18485284baefdee87"

RPROVIDES:${PN} += "ocaml-Cmdliner \
ocaml-Cmdliner-arg \
ocaml-Cmdliner-base \
ocaml-Cmdliner-cline \
ocaml-Cmdliner-cmd \
ocaml-Cmdliner-completion \
ocaml-Cmdliner-def \
ocaml-Cmdliner-docgen \
ocaml-Cmdliner-eval \
ocaml-Cmdliner-manpage \
ocaml-Cmdliner-msg \
ocaml-Cmdliner-term \
ocaml-Cmdliner-trie \
ocaml-cmdliner-devel \
ocamlfind-cmdliner \
ocamlx-Cmdliner \
ocamlx-Cmdliner-arg \
ocamlx-Cmdliner-base \
ocamlx-Cmdliner-cline \
ocamlx-Cmdliner-cmd \
ocamlx-Cmdliner-completion \
ocamlx-Cmdliner-def \
ocamlx-Cmdliner-docgen \
ocamlx-Cmdliner-eval \
ocamlx-Cmdliner-manpage \
ocamlx-Cmdliner-msg \
ocamlx-Cmdliner-term \
ocamlx-Cmdliner-trie"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Bool \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Char \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Filename \
ocaml-Stdlib--Format \
ocaml-Stdlib--Int \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Nativeint \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Option \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Result \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-cmdliner \
ocamlx-CamlinternalLazy \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Bool \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Filename \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Int \
ocamlx-Stdlib--Int32 \
ocamlx-Stdlib--Int64 \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Nativeint \
ocamlx-Stdlib--Option \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Result \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys"

inherit rpm
