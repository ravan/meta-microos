SUMMARY = "OCaml bindings for Augeas configuration API"
DESCRIPTION = "Augeas is a unified system for editing arbitrary configuration \
files. This provides complete OCaml bindings for Augeas."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7"

RPM_NAME = "ocaml-augeas-0.7-3.2.aarch64.rpm"
RPM_HASH = "7dc3e2843737df32a6b70d730a2b3fbd150ef59862d1c2c719ae600d96b9bf68e0560c7573b7958697a0b1ed928407a2f00f4ca09e390522828ab509f367a087"

RPROVIDES:${PN} += "ocaml-augeas"

RDEPENDS:${PN} += ""

inherit rpm
