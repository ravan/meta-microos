SUMMARY = "KIWI - manual pages"
DESCRIPTION = "Provides manual pages to describe the kiwi commands"
LICENSE = "GPL-3.0-or-later"

PV = "10.3.11"

RPM_NAME = "kiwi-man-pages-10.3.11-1.1.aarch64.rpm"
RPM_HASH = "32e52bf7afab4497abf939e61c9c004cc653c38a69c9b698e0be00198e02c8e40183dc8f0facad4eb407b8d8857670f5d837eb367893e8c13a18812dd30daa21"

RPROVIDES:${PN} += "kiwi-man-pages"

RDEPENDS:${PN} += ""

inherit rpm
