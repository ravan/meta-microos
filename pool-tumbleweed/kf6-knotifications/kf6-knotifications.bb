SUMMARY = "KDE Desktop notifications"
DESCRIPTION = "KNotification is used to notify the user of an event. It covers feedback and \
persistent events."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-knotifications-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "1f63658bfa4f211072212a8f6b0a40169db3afe0b603e4fe29fac7555abccc606d4a9ba4623faad4c1058e3479e38986f896865fcafd91fc24eb6425cc3b01ea"

RPROVIDES:${PN} += "kf6-knotifications"

RDEPENDS:${PN} += ""

inherit rpm
