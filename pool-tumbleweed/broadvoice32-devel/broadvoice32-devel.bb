SUMMARY = "BroadVoice 32 development files"
DESCRIPTION = "Header files for the libbv32 library."
LICENSE = "LGPL-2.1-only"

PV = "1.2"

RPM_NAME = "broadvoice32-devel-1.2-3.9.aarch64.rpm"
RPM_HASH = "8b20307603fbeb07c2effe95d912bde8151f91d7fb9c034ad3b1f37630739e307ce8366c8f231d0fcdc1aca990d808639b9155452d82820e2e2cf57f637f7fa0"

RPROVIDES:${PN} += "broadvoice32-devel"

RDEPENDS:${PN} += "broadvoice32"

inherit rpm
