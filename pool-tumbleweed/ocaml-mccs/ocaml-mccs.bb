SUMMARY = "Stripped-down version of mccs with OCaml bindings"
DESCRIPTION = "mccs (which stands for Multi Criteria CUDF Solver) is a CUDF problem solver \
developed at UNS during the European MANCOOSI project."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception & BSD-3-Clause & GPL-3.0-only"

PV = "1.1+19"

RPM_NAME = "ocaml-mccs-1.1+19-4.2.aarch64.rpm"
RPM_HASH = "07e0b41af4320014796ed9f3f4dbf736de9531486ec2f26809aadba3065a67abfdfb8b227c608120ae64edc5beebd71c368f08e2caef47d3736d65f4257e320e"

RPROVIDES:${PN} += "ocaml-mccs"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
