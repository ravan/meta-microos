SUMMARY = "The OCaml graphics library"
DESCRIPTION = "The graphics library provides a set of portable drawing \
primitives. Drawing takes place in a separate window that is created \
when Graphics.open_graph is called. \
 \
This library used to be distributed with OCaml up to OCaml 4.08."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception"

PV = "5.2.0"

RPM_NAME = "ocaml-graphics-5.2.0-2.2.aarch64.rpm"
RPM_HASH = "79ef5998c8b00bda9bc725f620376b20ef4ec7f60582bf4ab731dd0422fdce51de970ce118410c0ef857b1c69bd32d8bbc3a2a6c724a5409cc3dc5d9d7ca9139"

RPROVIDES:${PN} += "ocaml-graphics"

RDEPENDS:${PN} += "libX11.so.6 \
libXft.so.2 \
libc.so.6"

inherit rpm
