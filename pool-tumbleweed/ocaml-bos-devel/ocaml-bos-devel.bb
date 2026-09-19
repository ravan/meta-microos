SUMMARY = "Development files for ocaml-bos"
DESCRIPTION = "The ocaml-bos-devel package contains libraries and signature files for \
developing applications that use ocaml-bos."
LICENSE = "ISC"

PV = "0.3.0"

RPM_NAME = "ocaml-bos-devel-0.3.0-1.3.aarch64.rpm"
RPM_HASH = "f1c97fa0372a2d0916a1d45da43e147c8e5a2310b4b30dad24c85e9f1f2104d6159c829a7d91a63e4f26da3f090865b9b1c439fcacf13533ff10365b6efea0ba"

RPROVIDES:${PN} += "ocaml-Bos \
ocaml-Bos-base \
ocaml-Bos-cmd \
ocaml-Bos-log \
ocaml-Bos-os-arg \
ocaml-Bos-os-cmd \
ocaml-Bos-os-dir \
ocaml-Bos-os-env \
ocaml-Bos-os-file \
ocaml-Bos-os-path \
ocaml-Bos-os-tmp \
ocaml-Bos-os-u \
ocaml-Bos-pat \
ocaml-Bos-setup \
ocaml-Bos-top \
ocaml-bos-devel \
ocamlfind-bos \
ocamlfind-bos.setup \
ocamlfind-bos.top \
ocamlx-Bos \
ocamlx-Bos-base \
ocamlx-Bos-cmd \
ocamlx-Bos-log \
ocamlx-Bos-os-arg \
ocamlx-Bos-os-cmd \
ocamlx-Bos-os-dir \
ocamlx-Bos-os-env \
ocamlx-Bos-os-file \
ocamlx-Bos-os-path \
ocamlx-Bos-os-tmp \
ocamlx-Bos-os-u \
ocamlx-Bos-pat \
ocamlx-Bos-setup \
ocamlx-Bos-top"

RDEPENDS:${PN} += "ocaml-Astring \
ocaml-Asttypes \
ocaml-Build-path-prefix-map \
ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-Cmi-format \
ocaml-Data-types \
ocaml-Env \
ocaml-Fmt \
ocaml-Fmt-tty \
ocaml-Format-doc \
ocaml-Fpath \
ocaml-Ident \
ocaml-Identifiable \
ocaml-Load-path \
ocaml-Location \
ocaml-Logs \
ocaml-Logs-fmt \
ocaml-Longident \
ocaml-Misc \
ocaml-Oprint \
ocaml-Outcometree \
ocaml-Parsetree \
ocaml-Path \
ocaml-Primitive \
ocaml-Result \
ocaml-Rresult \
ocaml-Shape \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Digest \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Filename \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--In-channel \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Nativeint \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Option \
ocaml-Stdlib--Out-channel \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Queue \
ocaml-Stdlib--Random \
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
ocaml-Unix \
ocaml-Warnings \
ocaml-bos \
ocamlfind-astring \
ocamlfind-astring.top \
ocamlfind-bos \
ocamlfind-compiler-libs.toplevel \
ocamlfind-fmt \
ocamlfind-fmt.top \
ocamlfind-fmt.tty \
ocamlfind-fpath \
ocamlfind-fpath.top \
ocamlfind-logs \
ocamlfind-logs.fmt \
ocamlfind-logs.top \
ocamlfind-rresult \
ocamlfind-rresult.top \
ocamlfind-unix \
ocamlx-Astring \
ocamlx-CamlinternalLazy \
ocamlx-Fmt \
ocamlx-Fmt-tty \
ocamlx-Fpath \
ocamlx-Logs \
ocamlx-Logs-fmt \
ocamlx-Result \
ocamlx-Rresult \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Filename \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--In-channel \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Option \
ocamlx-Stdlib--Out-channel \
ocamlx-Stdlib--Random \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--Sys \
ocamlx-Toploop \
ocamlx-Unix"

inherit rpm
