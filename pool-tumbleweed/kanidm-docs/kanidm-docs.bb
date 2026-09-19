SUMMARY = "Documentation for Kanidm Administration"
DESCRIPTION = "Documentation for using and configuring Kanidm."
LICENSE = "MPL-2.0"

PV = "1.10.4~git0.97b1edbc4"

RPM_NAME = "kanidm-docs-1.10.4~git0.97b1edbc4-1.2.aarch64.rpm"
RPM_HASH = "bdd4875c656c0a7bfc95cbe598f9b00aac9eb0888683e618d4c613becd80ec98b6f8a9667d1637565c27934b7f4a850858046e61c95018ef982e38259b4fa9b5"

RPROVIDES:${PN} += "kanidm-docs"

RDEPENDS:${PN} += ""

inherit rpm
