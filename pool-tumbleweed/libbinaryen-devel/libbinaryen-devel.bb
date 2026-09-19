SUMMARY = "Development files for libbinaryen"
DESCRIPTION = "Development files for libbinaryen."
LICENSE = "Apache-2.0"

PV = "123"

RPM_NAME = "libbinaryen-devel-123-1.6.aarch64.rpm"
RPM_HASH = "231354884dc03e97225e262604a5c7240b75c81dfcf7b931b4fec71e443692bd932aad16e585ca0032a7e83d9b811c3243e87901659ae253dcf52d520457a3be"

RPROVIDES:${PN} += "libbinaryen-devel"

RDEPENDS:${PN} += "libbinaryen"

inherit rpm
