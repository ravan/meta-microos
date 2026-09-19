SUMMARY = "Shim to substitute Pervasives with Stdlib before 4.08"
DESCRIPTION = "Compiling against this library allows replacing uses of Pervasives \
with Stdlib before 4.08. For example, one can use Stdlib.compare \
instead of Pervasives.compare. It does not, however, provide \
the new functions and modules that were added in the Stdlib module."
LICENSE = "LGPL-2.1-or-later-with-OCaml-LGPL-linking-exception"

PV = "0.3.0"

RPM_NAME = "ocaml-stdlib-shims-0.3.0-2.1.aarch64.rpm"
RPM_HASH = "4f04473fd608f5d6ae4e8e49fd17b97e5da08b8dcef6703043a3551f6185ea0c8064297654e95fceed23a50693180ee92c6a37fb088a6d769ba73fc595c2b478"

RPROVIDES:${PN} += "ocaml-stdlib-shims"

RDEPENDS:${PN} += ""

inherit rpm
