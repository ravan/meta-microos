SUMMARY = "Development files for ocaml-graphics"
DESCRIPTION = "The ocaml-graphics-devel package contains libraries and signature files for \
developing applications that use ocaml-graphics."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception"

PV = "5.2.0"

RPM_NAME = "ocaml-graphics-devel-5.2.0-2.2.aarch64.rpm"
RPM_HASH = "a824fb1acbffa4d94bce457d6281cf0d95e44220ed7fca7629e4bce097df9ae5c51dcef86ddc3d9b08a1d98d7e72633b4905ae2fb612a8968fbf13afb2c7ad77"

RPROVIDES:${PN} += "config-ocaml-graphics-devel \
ocaml-Graphics \
ocaml-GraphicsX11 \
ocaml-graphics-devel \
ocaml-x11 \
ocamlfind-graphics \
ocamlx-Graphics \
ocamlx-GraphicsX11"

RDEPENDS:${PN} += "libX11.so.6 \
libXft.so.2 \
libc.so.6 \
ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Callback \
ocaml-Stdlib--Either \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--List \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Sys \
ocaml-graphics \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Callback \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Sys \
pkgconfig-x11 \
pkgconfig-xft"

inherit rpm
