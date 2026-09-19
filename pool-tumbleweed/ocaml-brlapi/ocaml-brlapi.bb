SUMMARY = "Library to use BRLTTY from applications -- OCaml Bindings"
DESCRIPTION = "BrlAPI is a service provided by the brltty daemon. \
 \
Its purpose is to allow programmers to write applications that take \
advantage of a braille terminal in order to deliver a blind user \
suitable information for his/her specific needs. \
 \
While an application communicates with the braille terminal, everything \
brltty sends to the braille terminal in the application's console is \
ignored, whereas each piece of data coming from the braille terminal is \
sent to the application, rather than to brltty."
LICENSE = "LGPL-2.1-or-later"

PV = "6.9.1"

RPM_NAME = "ocaml-brlapi-6.9.1-2.1.aarch64.rpm"
RPM_HASH = "8941a6f4198d00663b22b2b6d21d4a8629e44a75407be1d2d1139cb8673a172b2d4e4847e0a05f248589736a7cc814862d19378aa452f9291ee56f6b5f4cf390"

RPROVIDES:${PN} += "config-ocaml-brlapi \
ocaml-Brlapi \
ocaml-brlapi \
ocamlfind-brlapi \
ocamlx-Brlapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6 \
ocaml \
ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Callback \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Either \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Sys \
ocaml-Unix \
ocamlfind-unix \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Callback"

inherit rpm
