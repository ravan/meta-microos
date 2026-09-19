SUMMARY = "Implementation of Status Notifier Items"
DESCRIPTION = "Implementation of Status Notifier Items."
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kstatusnotifieritem-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "acfa6f9521302b518cd604db59dae21e71c5e4f1efd5639f43364b82d7675b53a96043ae4cf5b696e83004034943b4012e77553325c2587a84ade418aac05176"

RPROVIDES:${PN} += "kf6-kstatusnotifieritem"

RDEPENDS:${PN} += ""

inherit rpm
