SUMMARY = "Auxiliary package"
DESCRIPTION = "Auxiliary package, needed for proper update from vixie-cron 4.1 to cronie 1.4.4"
LICENSE = "BSD-3-Clause & GPL-2.0-only & MIT"

PV = "4.2"

RPM_NAME = "cron-4.2-100.3.aarch64.rpm"
RPM_HASH = "957f72ecd380a6e1c902ae818348fc2782e636bf53c425e4aa59d711a4a4b2b9560acb77d2f008c49389742fda6e5546083f79bd30ad3b47bd34986387e2c6f6"

RPROVIDES:${PN} += "cron"

RDEPENDS:${PN} += "/usr/bin/sh \
cronie \
permissions"

inherit rpm
