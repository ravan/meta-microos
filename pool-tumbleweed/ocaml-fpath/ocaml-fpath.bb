SUMMARY = "File paths for OCaml"
DESCRIPTION = "Fpath is an OCaml module for handling file system paths with POSIX or Windows conventions. Fpath processes paths without accessing the file system and is independent from any system library."
LICENSE = "ISC"

PV = "0.7.3"

RPM_NAME = "ocaml-fpath-0.7.3-3.3.aarch64.rpm"
RPM_HASH = "ba9b4a60114b416fe358fc3f0fc27775d7d0c27c4f83e2bef1520b08df67167fe4b35331ba791678e27af3b3880f267fea50b5d581413160a70160c04ed6285e"

RPROVIDES:${PN} += "ocaml-fpath"

RDEPENDS:${PN} += ""

inherit rpm
