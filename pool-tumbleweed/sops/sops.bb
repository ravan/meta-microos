SUMMARY = "Simple and flexible tool for managing secrets"
DESCRIPTION = "Simple and flexible tool for managing secrets"
LICENSE = "MPL-2.0"

PV = "3.13.3"

RPM_NAME = "sops-3.13.3-1.2.aarch64.rpm"
RPM_HASH = "6ab637228d8ede12c75b9bd0d6061c357bdc7cda952812912ae606872ada43ae2cb614fa45e837cc8f3f4b71fb66f034a85a134a2f53c2adb26d0df9730bc8a5"

RPROVIDES:${PN} += "sops"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
