SUMMARY = "Development files for ocaml-libvirt"
DESCRIPTION = "The ocaml-libvirt-devel package contains libraries and signature files for \
developing applications that use ocaml-libvirt."
LICENSE = "LGPL-2.0-or-later"

PV = "0.6.1.7"

RPM_NAME = "ocaml-libvirt-devel-0.6.1.7-3.1.aarch64.rpm"
RPM_HASH = "de6fce11aef937672395dc8d425d623d3033b7ce5a7798c1ff378881344350d5498b3fdd3f4d7165f3f5e7e5279190e477b6bdd75c864734fcb05184fabe7b9e"

RPROVIDES:${PN} += "config-ocaml-libvirt-devel \
ocaml-Libvirt \
ocaml-Libvirt-version \
ocaml-libvirt-devel \
ocamlfind-libvirt \
ocamlx-Libvirt \
ocamlx-Libvirt-version"

RDEPENDS:${PN} += "libc.so.6 \
libvirt.so.0 \
ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Callback \
ocaml-Stdlib--Char \
ocaml-Stdlib--Either \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--List \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-libvirt \
ocamlfind-unix \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Callback \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Int64 \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--String \
pkgconfig-libvirt"

inherit rpm
