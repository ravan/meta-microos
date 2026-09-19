SUMMARY = "Development files for snobol4"
DESCRIPTION = "Development files for snobol4."
LICENSE = "BSD-2-Clause"

PV = "2.3.1"

RPM_NAME = "snobol4-devel-2.3.1-2.12.aarch64.rpm"
RPM_HASH = "c262a8a7e84fb4672a12fd87c32d1391a0a4da2f20471cda3d7d9bda4e3302b101bf37ccb7e86af0b55954919d45e235ac3dbc9071b39921b842c9fa3b398253"

RPROVIDES:${PN} += "snobol4-devel"

RDEPENDS:${PN} += "snobol4"

inherit rpm
