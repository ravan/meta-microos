SUMMARY = "Development files for ocaml-stdlib-shims"
DESCRIPTION = "The ocaml-stdlib-shims-devel package contains libraries and signature files for \
developing applications that use ocaml-stdlib-shims."
LICENSE = "LGPL-2.1-or-later-with-OCaml-LGPL-linking-exception"

PV = "0.3.0"

RPM_NAME = "ocaml-stdlib-shims-devel-0.3.0-2.1.aarch64.rpm"
RPM_HASH = "280ec5cfca60048ed776c3ffc9f32c09ed142f04eb346dae90651a2c96fe13a058658f99c10658a429be3dfce5986f4e6272f3cab024a6821297ca181bb683cf"

RPROVIDES:${PN} += "ocaml-stdlib-shims-devel \
ocamlfind-stdlib-shims"

RDEPENDS:${PN} += "ocaml-stdlib-shims"

inherit rpm
