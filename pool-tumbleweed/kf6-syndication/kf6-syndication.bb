SUMMARY = "RSS/Atom parsing library"
DESCRIPTION = "KF6Syndication is an RSS/Atom parsing library by KDE, which \
also provides an API to fetch feeds from the network."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-syndication-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "9a0932b74331d6d0908991a635643cac2f763b48b589f1ba0e5c28192c1785b6ac9bdae8bb3c4820b4a591827b85db71adbffee775959cf9452dcf500c4350f1"

RPROVIDES:${PN} += "kf6-syndication"

RDEPENDS:${PN} += ""

inherit rpm
