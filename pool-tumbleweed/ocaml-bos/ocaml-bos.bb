SUMMARY = "Basic OS interaction for OCaml"
DESCRIPTION = "Bos provides support for basic and robust interaction with the operating system \
in OCaml. It has functions to access the process environment, parse command line \
arguments, interact with the file system and run command line programs."
LICENSE = "ISC"

PV = "0.3.0"

RPM_NAME = "ocaml-bos-0.3.0-1.3.aarch64.rpm"
RPM_HASH = "59454482f3e168597ce4ebb2d75d7ede876988fb58faf4ec6b05f774c9be2afb86a5ad38223ff9fe05d4ddf31172112acf2d6db4237d4912f46a994d3d5d39ee"

RPROVIDES:${PN} += "ocaml-bos"

RDEPENDS:${PN} += ""

inherit rpm
