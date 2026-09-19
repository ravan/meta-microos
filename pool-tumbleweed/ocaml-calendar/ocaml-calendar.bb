SUMMARY = "Objective Caml library for managing dates and times"
DESCRIPTION = "Objective Caml library for managing dates and times."
LICENSE = "LGPL-2.0-only"

PV = "3.0.0"

RPM_NAME = "ocaml-calendar-3.0.0-3.1.aarch64.rpm"
RPM_HASH = "6066f69973b571a9cab230f168ca102bf9ee53e6a1027e65607a39c88d60d131cd6aa59bfeead72914c303aeafdeec4fbfd41d1ea637693b6598e0c51c383730"

RPROVIDES:${PN} += "ocaml-calendar"

RDEPENDS:${PN} += ""

inherit rpm
