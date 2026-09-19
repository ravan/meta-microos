SUMMARY = "Development files for ocaml-curses"
DESCRIPTION = "The ocaml-curses-devel package contains libraries and signature files for \
developing applications that use ocaml-curses."
LICENSE = "LGPL-2.1+"

PV = "1.0.11"

RPM_NAME = "ocaml-curses-devel-1.0.11-3.2.aarch64.rpm"
RPM_HASH = "809c301ad8baa521cc2d6749f5130200fd294762305563075fc6f2eeb4611befa30dbef485d23049a18ac47852f21064bdc0f980b6c0dfe80957df8109446e55"

RPROVIDES:${PN} += "config-ocaml-curses-devel \
ocaml-Curses \
ocaml-curses-devel \
ocamlfind-curses \
ocamlx-Curses"

RDEPENDS:${PN} += "libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
ncurses-devel \
ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Either \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--List \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Sys \
ocaml-Unix \
ocaml-curses \
ocamlfind-unix \
ocamlx-Stdlib \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--List"

inherit rpm
