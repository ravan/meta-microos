SUMMARY = "Development files for ocaml-parmap"
DESCRIPTION = "The ocaml-parmap-devel package contains libraries and signature files for \
developing applications that use ocaml-parmap."
LICENSE = "LGPL-2.0-only"

PV = "1.2.5"

RPM_NAME = "ocaml-parmap-devel-1.2.5-3.2.aarch64.rpm"
RPM_HASH = "4774365c8f80ced1b1529feae0a07fd5580de719d2f6e525eab2fe3c60ca0dc414beb8e9d1d8960b817b6a6193bf476be977360584fd8c1811ef36246d61348b"

RPROVIDES:${PN} += "config-ocaml-parmap-devel \
ocaml-Bytearray \
ocaml-Parmap \
ocaml-Parmap-compat \
ocaml-Parmap-utils \
ocaml-Setcore \
ocaml-parmap-devel \
ocamlfind-parmap \
ocamlx-Bytearray \
ocamlx-Parmap \
ocamlx-Parmap-compat \
ocamlx-Parmap-utils \
ocamlx-Setcore"

RDEPENDS:${PN} += "libc.so.6 \
ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Filename \
ocaml-Stdlib--Format \
ocaml-Stdlib--Gc \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--List \
ocaml-Stdlib--Marshal \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Unix \
ocaml-parmap \
ocamlfind-bigarray \
ocamlfind-unix \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Bigarray \
ocamlx-Stdlib--Filename \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Gc \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Marshal \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Sys \
ocamlx-Unix"

inherit rpm
