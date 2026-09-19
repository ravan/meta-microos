SUMMARY = "OCaml bindings for ncurses"
DESCRIPTION = "OCaml bindings for ncurses."
LICENSE = "LGPL-2.1+"

PV = "1.0.11"

RPM_NAME = "ocaml-curses-1.0.11-3.2.aarch64.rpm"
RPM_HASH = "c70915191ada11449a79f0571d6c3e0b5cdc11a9cb2cfb968630c11127b501464965ed9b1dc1af2b19111d0587bcf8dd72fbed4945f3f9d5f4b0df7e362e9ce1"

RPROVIDES:${PN} += "ocaml-curses"

RDEPENDS:${PN} += "libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
