SUMMARY = "Development files for ocaml-logs"
DESCRIPTION = "The ocaml-logs-devel package contains libraries and signature files for \
developing applications that use ocaml-logs."
LICENSE = "ISC"

PV = "0.10.0"

RPM_NAME = "ocaml-logs-devel-0.10.0-1.3.aarch64.rpm"
RPM_HASH = "0aca309ac3a5c6cc577cebfb95d30567ceeb6972672bb73c3b1bce2a8cb9ccbfaa6fbfc9bbd4e2df9b7de4fc0e8e0f5a0781196e9c360308b0e677341f519bce"

RPROVIDES:${PN} += "ocaml-Logs \
ocaml-Logs-cli \
ocaml-Logs-fmt \
ocaml-Logs-threaded \
ocaml-Logs-top \
ocaml-logs-devel \
ocamlfind-logs \
ocamlfind-logs.cli \
ocamlfind-logs.fmt \
ocamlfind-logs.threaded \
ocamlfind-logs.top \
ocamlx-Logs \
ocamlx-Logs-cli \
ocamlx-Logs-fmt \
ocamlx-Logs-threaded \
ocamlx-Logs-top"

RDEPENDS:${PN} += "ocaml-Asttypes \
ocaml-Build-path-prefix-map \
ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-Cmdliner \
ocaml-Cmi-format \
ocaml-Data-types \
ocaml-Env \
ocaml-Fmt \
ocaml-Format-doc \
ocaml-Ident \
ocaml-Identifiable \
ocaml-Load-path \
ocaml-Location \
ocaml-Longident \
ocaml-Misc \
ocaml-Oprint \
ocaml-Outcometree \
ocaml-Parsetree \
ocaml-Path \
ocaml-Primitive \
ocaml-Shape \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Atomic \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Digest \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Filename \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Mutex \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Queue \
ocaml-Stdlib--Result \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--Stack \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Subst \
ocaml-Toploop \
ocaml-Type-immediacy \
ocaml-Types \
ocaml-Unit-info \
ocaml-Warnings \
ocaml-logs \
ocamlfind-cmdliner \
ocamlfind-compiler-libs.toplevel \
ocamlfind-fmt \
ocamlfind-logs \
ocamlfind-result \
ocamlfind-threads \
ocamlx-Cmdliner \
ocamlx-Fmt \
ocamlx-Stdlib \
ocamlx-Stdlib--Atomic \
ocamlx-Stdlib--Filename \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Mutex \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Sys \
ocamlx-Toploop"

inherit rpm
